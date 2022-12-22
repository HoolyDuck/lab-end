<template>
  <footer>
    <div class="footer-menu">
      <p class="cool-text bold">Contact us</p>
      <div class="footer-icons">
        <a href="mailto:random@gmail.com">
          <i class="fa-solid fa-envelope "></i>
        </a>
        <a href="tel:000-000-0000">
          <i class="fa-solid fa-phone "></i>
        </a>
        <a href="https://t.me/h_onk">
          <i class="fa-solid fa-paper-plane "></i>
        </a>
      </div>
    </div>
  </footer>
</template>

<script>
export default {
  name: "Footer"
}
</script>

<style>
footer {

  --borderWidth: 2px;
  background: #1D1F20;
  position: relative;
  border-radius: var(--borderWidth);

  bottom: 0;
  width: 100vw;
  min-height: 15vh;
  background: linear-gradient(to bottom, #1c1c1c, var(--color-background));
  display: flex;
  justify-content: center;
}

footer:after {
  content: '';
  position: absolute;
  top: calc(-1 * var(--borderWidth));
  left: calc(-1 * var(--borderWidth));
  height: calc(100% + var(--borderWidth));
  width: calc(100% + var(--borderWidth));
  background: linear-gradient(60deg, #525252, #3ad59f, #9a9a9a, rgba(32, 178, 170, 0.45));
  border-radius: calc(2 * var(--borderWidth));
  z-index: -1;
  animation: animatedgradient 3s ease alternate infinite;
  background-size: 300% 300%;
}


@keyframes animatedgradient {
  0% {
    background-position: 0 50%;
  }
  50% {
    background-position: 100% 50%;
  }
  100% {
    background-position: 0 50%;
  }
}


.footer-menu {
  padding: 1rem;
}

.footer-icons a {
  color: grey;
}

.footer-icons {
  display: flex;
  gap: .4rem;
  justify-content: center;
}

</style>