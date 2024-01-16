function abrirVentana(numero) {
    //Creamos una funcion llamada abrirVentana y 2 variables llamadas nombreVentana y caracteristicasVentana
    var nombreVentana = "window" + numero;
    var caracteristicasVentana = "width=300,height=300";
    //No he podido cambiar las caracteristicas de la ventana porque no me va
    //Creamos un objeto llamado objetoVentana y abrimos la ventana
    var objetoventana = window.open("", nombreVentana, caracteristicasVentana);

    switch (numero) {
        case 1:
            //Creamos un formulario HTML que le pregunte al usuario el usuario la contraseña y la nueva contraseña
            //Al darle al boton enviar la llevamos a la  funcion autenticar.
            var formularioHTML = `
        <form>
          <label for="username">Usuario:</label>
          <input type="text" id="username" name="username"><br><br>
          <label for="password">Contraseña:</label>
          <input type="password" id="password" name="password"><br><br>
          <label for="newPassword">Nueva Contraseña:</label>
          <input type="password" id="newPassword" name="newPassword"><br><br>
          <button onclick="autenticar()">Enviar</button>
        </form>
      `;

//Decimos que el HTML interno del objeto es formularioHTML

            objetoventana.document.body.innerHTML = formularioHTML;
            break;
        case 2:
            //Segundo caso, con 2 select, uno imprime una lista de números en la que tenemos que elegir la longitud
            var listaHTML = `
        <label for="lista">Longitud de la lista de números:</label>
        <select id="lista">
          <option value="50">50</option>
          <option value="51">51</option>
          <option value="51">52</option>
          <option value="51">53</option>
          <option value="51">54</option>
          <option value="51">55</option>
          <option value="51">56</option>
          <option value="51">57</option>
          <option value="51">58</option>
          <option value="51">59</option>
          <option value="60">60</option>
        </select><br><br>
      `;
//Y otro dice el numero de valores aleatorios a escoger
            var seleccionAleatoriaHTML = `
        <label for="seleccionAleatoria">Número de valores aleatorios a escoger:</label>
        <select id="seleccionAleatoria">
          <option value="6">6</option>
          <option value="7">7</option>
          <option value="8">8</option>
          <option value="9">9</option>
        </select><br><br>
      `;
//Y un boton para generar la lista
            var botonHTML = `
        <button onclick="generarLista()">Generar Lista</button>
      `;
//Mostramos las cosas con document.body.innerHTMl
            objetoventana.document.body.innerHTML = listaHTML + seleccionAleatoriaHTML + botonHTML;
            break;
        case 3:
            //Mostramos las cosas, deberia de mostrarlas arriba pero intente mostrarlas abajo
            //aun asi no carga
            var aleatoriosHTML = `
        <p>Valores aleatorios:</p>
        <p>Lista a representar: </p>
      `;
//Pero lo mostramos
            objetoventana.document.body.innerHTML = aleatoriosHTML;
            break;
        case 4:
            //Mostramos la contraseña y la fecha y hora de la ultima vez que se introdujo
            var contrasenaHTML = `
        <p>Contraseña vigente del usuario:</p>
        <p>Fecha y hora de la última vez que se introdujo:</p>
      `;
//Mostramos
            objetoventana.document.body.innerHTML = contrasenaHTML;
            break;
    }
}
//Funcion para autenticar la contraseña
function autenticar() {
    //Obtenemos el valor mediante la id
    var username = window.document.getElementById("username").value;
    var password = window.document.getElementById("password").value;
//Si el usuario y la contraseña son correctos
    if (username === "alumno" && password === "bueno") {
        //Pues decimos la nuevaContraseña
        var nuevaContraseña = window.document.getElementById("newPassword").value;
//Si es correcto dice datos correctos
        var confirmacionHTML = `
        <p>Datos correctos, ¿Deseas cambiar la contraseña?</p>
        <input type="password" id="newPassword" name="newPassword" value="newPassword"><br><br>
        <button onclick="cambiarContrasena()">Cambiar Contraseña</button>
      `;

        window.document.body.innerHTML = confirmacionHTML;
        //Si no lo reintenta
    } else {
        var reintentarHTML = `
        <p>Datos incorrectos. ¿Quieres intentarlo de nuevo?</p>
        <button onclick="abrirVentana(1)">Volver a intentar</button>
      `;

        window.document.body.innerHTML = reintentarHTML;
    }
}
//Funcion para cambiar la contraseña
function cambiarContrasena() {
    var newPassword = window.document.getElementById("newPassword").value;

//Mensaje de contraseña cambiada 
    var successHTML = `
      <p>Contraseña cambiada exitosamente.</p>
    `;

    window.document.body.innerHTML = successHTML;
}
//Funcion para generar la lista
function generarLista() {
    var longitud = parseInt(window.document.getElementById("lista").value);
    var Cuenta_aleatorios = parseInt(window.document.getElementById("seleccionAleatoria").value);
    //Generamos la lista
    var lista=[];
    var numero=0;
    var aleatorios=[];
    //Metemos en la lista todos los números
for(var i=0;i<longitud;i++){
    numero++
lista.push(numero);
}
//Creamos un bucle for el cual por x numeros de cuenta aleatorios coja y saque aleatorios de la lista
for(var i=0;i<Cuenta_aleatorios;i++){
   aleatorios[i]=Math.floor(Math.random()*lista.length);
}


//Imprimimos los valores
    var listaHTML = `
      <p>Valores aleatorios: Cuenta_aleatorios</p>
      <p>Lista a representar: longitud</p>
    `;

    window.document.body.innerHTML = listaHTML;
}

