package com.weblab.backend.mappers;

import com.weblab.backend.entities.Disciplines;
import com.weblab.backend.entities.Groups;
import com.weblab.backend.entities.Schedules;
import com.weblab.backend.entities.Teachers;
import com.weblab.backend.models.ImprovedScheduleModel;
import com.weblab.backend.models.PageScheduleModel;
import com.weblab.backend.models.ScheduleModel;

public class ScheduleMapper {
    public static Schedules toEntity(ScheduleModel scheduleModel){
        return Schedules.builder()
                .classroom(scheduleModel.getClassroom())
                .name(scheduleModel.getName())
                .time(scheduleModel.getTime())
                .disciplineId(Disciplines.builder()
                        .id(scheduleModel.getDisciplineId())
                        .build())
                .groupId(Groups.builder()
                        .id(scheduleModel.getGroupId())
                        .build())
                .teacherId(Teachers.builder()
                        .id(scheduleModel.getTeacherId())
                        .build())
                .build();
    }
    public static ScheduleModel toModel(Schedules schedules){
        return  ScheduleModel.builder()
                .id(schedules.getId())
                .classroom(schedules.getClassroom())
                .name(schedules.getName())
                .time(schedules.getTime())
                .disciplineId(schedules.getDisciplineId().getId())
                .teacherId(schedules.getTeacherId().getId())
                .groupId(schedules.getGroupId().getId())
                .build();
    }
    public static ImprovedScheduleModel toImprovedModel(Schedules schedules){
        return ImprovedScheduleModel.builder()
                .id(schedules.getId())
                .classroom(schedules.getClassroom())
                .name(schedules.getName())
                .time(schedules.getTime())
                .disciplineId(schedules.getDisciplineId().getName())
                .teacherId(schedules.getTeacherId())
                .groupId(schedules.getGroupId().getName())
                .build();
    }

    public static PageScheduleModel toPageModel(Schedules schedule){
        return PageScheduleModel.builder()
                .classroom(schedule.getClassroom())
                .name(schedule.getName())
                .time(schedule.getTime())
                .groupName(schedule.getGroupId().getName())
                .teacherName(schedule.getTeacherId().getName())
                .teacherSurname(schedule.getTeacherId().getSurname())
                .disciplineName(schedule.getDisciplineId().getName())
                .build();
    }
}
