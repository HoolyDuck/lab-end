<template>
  <footer >
    <div v-show="show" class="elf"><p>Footer</p></div>
    <div v-show="show" class="elf">
      <h4>Useful links</h4>
    </div>
    <div class="elf">
      <a v-show="show" href="https://t.me/dwarf_strong"><img class="icon" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeLafDXfkyZ3SiJ3aUQS3lpEsY_cN-AYqICg&usqp=CAU"></a>
      <a v-show="show" href="https://api.whatsapp.com/send?phone=380980648928"><img class="icon" src="data:image/jpeg;base64,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"></a>
      <a v-show="show" href="mailto:serhio3347@gmail.com"><img class="icon" src="data:image/png;base64,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"></a>
      <a v-show="show" class="loh" href="tel:+380980648928"><img class="icon" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZHQ7egS6xCVw0tTOcFA3uTOQEdGGQPakZBg&usqp=CAU"></a>
      <button v-show="show" type="button" class="hide_but" @click="hide"><img class="but1_img" src="https://aoxoa.co/wp-content/uploads/2016/02/add-back-to-top-button-manually-wordpress.jpg"></button>
      <button v-show="!show" type="button" class="hide_but" @click="unhide"><img class="but2_img" src="https://aoxoa.co/wp-content/uploads/2016/02/add-back-to-top-button-manually-wordpress.jpg"></button>
    </div>
  </footer>
</template>

<script>

export default {
  name: "Footer",
  data: () => ({
    show:true
  }),
  methods: {
    hide(){
        this.show=false
    },
    unhide(){
      this.show=true
    }
  }
}
</script>

<style>
footer{
  place-items: center;
  position: absolute;
  top: calc(100% + 3rem);;
  min-width: 100%;
  height: auto;
  display: flex;
  margin-top: 10rem;
  margin-bottom: 1rem;
  justify-content: space-between;
  flex-direction: column;
  box-shadow: 3px 7px 3px rgba(0, 0, 0, 0.2);

}
.icon{
  padding-right: 10%;
  position: relative;
  width: 40px;
  height: 24px;
  border-radius: 50%
}
.elf{
  justify-content: center;
  text-align: center;
  display: flex;
  flex-direction: row;
}
.hide_but{
  background-color: rgba(0,0,0,0) ;
  border: rgba(0,0,0,0);
  width: 3rem;
  height: auto;
}

.but1_img{
  position: absolute;
  top: calc(100% - 3rem);;
  right: calc(100% - 3rem);
  width: 36px;
  height: auto;
}
.but2_img{
  position: absolute;
  top: calc(100% + 3rem);;
  right: calc(100% - 8rem);
  width: 36px;
  height: auto;
}
.but1_img{
  transform: rotate(180deg);
}
</style>