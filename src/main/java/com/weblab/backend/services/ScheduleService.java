package com.weblab.backend.services;

import com.weblab.backend.entities.Groups;
import com.weblab.backend.entities.Schedules;
import com.weblab.backend.mappers.ScheduleMapper;
import com.weblab.backend.models.ImprovedScheduleModel;
import com.weblab.backend.models.PageScheduleModel;
import com.weblab.backend.models.ScheduleModel;
import com.weblab.backend.repositories.GroupsRepository;
import com.weblab.backend.repositories.SchedulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ScheduleService {
    private final SchedulesRepository schedulesRepository;

    @Autowired
    public ScheduleService(SchedulesRepository schedulesRepository) {
        this.schedulesRepository = schedulesRepository;
    }

    public List<ScheduleModel> getAllSchedules() {
        List<ScheduleModel> scheduleModels = getScheduleModels();
        schedulesRepository.findAll().forEach(schedules ->
                scheduleModels.add(ScheduleMapper.toModel(schedules)));
        return scheduleModels;
    }

    public List<ImprovedScheduleModel> getAllSchedules2() {
        List<ImprovedScheduleModel> improvedScheduleModels = new ArrayList<>();
        schedulesRepository.findAll().forEach(schedules ->
                improvedScheduleModels.add(ScheduleMapper.toImprovedModel(schedules)));
        return improvedScheduleModels;
    }

    public void insert_schedule(ScheduleModel insert_Schedule) {
        schedulesRepository.save(ScheduleMapper.toEntity(insert_Schedule));
    }

    public void update_schedule(ScheduleModel insert_Schedule, Long id) {
        Schedules newSchedule = ScheduleMapper.toEntity(insert_Schedule);
        schedulesRepository.findById(id)
                .map(schedule -> {
                    schedule.setTime(newSchedule.getTime());
                    schedule.setGroupId(newSchedule.getGroupId());
                    schedule.setDisciplineId(newSchedule.getDisciplineId());
                    schedule.setTeacherId(newSchedule.getTeacherId());
                    schedule.setName(newSchedule.getName());
                    schedule.setClassroom(newSchedule.getClassroom());
                    return schedulesRepository.save(schedule);
                }).orElseGet(() -> {
                    newSchedule.setId(id);
                    return schedulesRepository.save(newSchedule);
                });
    }

    public void delete_schedule(Long id) {
        schedulesRepository.deleteById(id);
    }

    public List<PageScheduleModel> getSchedulesByGroup(Long group_id) {
        List<Schedules> schedules_list = getSchedules();
        schedulesRepository.findAll().forEach(schedules_list::add);
        List<PageScheduleModel> scheduleModels_by_Group = getPageScheduleModels();;
        for (Schedules schedule : schedules_list) {
            if (Objects.equals(schedule.getGroupId().getId(), group_id)) {
                scheduleModels_by_Group.add(ScheduleMapper.toPageModel(schedule));
            }
        }
        return scheduleModels_by_Group;
    }

    public List<PageScheduleModel> getSchedulesByTeacher(Long teacher_id) {
        List<Schedules> schedules_list = getSchedules();
        schedulesRepository.findAll().forEach(schedules_list::add);
        List<PageScheduleModel> scheduleModels_by_Teacher = getPageScheduleModels();
        for (Schedules schedule : schedules_list) {
            if (Objects.equals(schedule.getTeacherId().getId(), teacher_id)) {
                scheduleModels_by_Teacher.add(ScheduleMapper.toPageModel(schedule));
            }
        }
        return scheduleModels_by_Teacher;
    }

    private List<ScheduleModel> getScheduleModels() {
        return new ArrayList<>();
    }
    private List<PageScheduleModel> getPageScheduleModels() {
        return new ArrayList<>();
    }
    private List<Schedules>getSchedules(){
        return new ArrayList<>();
    }
}
