<template>
  <div id="app">
    <NavBar/>
    <div class="logo-container">
      <AppLogo/>
    </div>
    <RouterView/>
  </div>
</template>

<script>
import NavBar from "@/components/NavBar.vue";
import AppLogo from "@/components/AppLogo.vue";

export default {
  name: 'App',
  components: {
    AppLogo,
    NavBar,
  }
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.logo-container {
  display: flex;
  align-items: center;
  justify-content: center;
}
</style>