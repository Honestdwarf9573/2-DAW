const usuario = {
    nombreUsuario: "ejemplo",
    contrasena: "12345"
  };
  
  function autenticar(nombreUsuario, contrasena) {
    if (nombreUsuario === usuario.nombreUsuario && contrasena === usuario.contrasena) {
      return true;
    } else {
      return false;
    }
  }
  const usu = "ejemplo";
const contra = "12345";

if (autenticar(usu,contra)) {
  console.log("Inicio de sesión exitoso");
} else {
  console.log("Credenciales incorrectas");
}
