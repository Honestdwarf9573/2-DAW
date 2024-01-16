<html>
   <head>
      <title>
         P&aacute;gina con Javascript.
      </title>
      <script language="javascript">
         var ventanaSecundaria;
         var coordenadaX = 0;
         var coordenadaY = 0;

         function abrirVentana()
         {
            ventanaSecundaria = window.open("", "ventanaSecundaria", "width=400, height=300, left=200, top=150, resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no");
         }

         function cerrarVentanaSecundaria() {
            if (ventanaSecundaria && !ventanaSecundaria.c