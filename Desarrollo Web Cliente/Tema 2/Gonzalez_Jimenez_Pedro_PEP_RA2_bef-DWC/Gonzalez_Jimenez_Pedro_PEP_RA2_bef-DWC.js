//Hecho por Pedro González

/*

Lados. Se llama así a cada una de las rectas que unen los vértices de un triángulo, delimitando la figura (el
adentro del afuera).

*/



/*
Vértices. Se trata de los puntos que definen un triángulo al unir dos de ellos con una línea recta. Así, si
tenemos los puntos A, B y C, uniéndolos con las rectas AB, BC y CA nos dará como resultado un triángulo.
Además, los vértices se hallan del lado opuesto de los ángulos interiores del polígono.

*/

/*
Ángulos. Cada dos lados de un triángulo forman en su vértice común algún tipo de ángulo, que se denomina
ángulo interior, pues da hacia el adentro del polígono. Estos ángulos son, al igual que los lados y los vértices,
siempre tres.


*/


//Clasificamos los triangulos por lados primero
/*
• Según sus lados. Dependiendo de la relación que haya entre sus tres distintos lados, un triángulo puede ser:
• Equilátero. Cuando sus tres lados tienen la misma exacta longitud.
• Isósceles. Cuando dos de sus lados tienen la misma longitud y el tercero una distinta.
• Escaleno. Cuando sus tres lados poseen longitudes distintas entre sí



//La funcion principal, que pide la cantidad de triangulos, los clasifica y de dice cual es el que menos esta
*/
function triangulos() {

    //Le preguntamos cuantos triángulos quiere añadir usuario
    var numero = prompt("Dime cuantos triangulos quieres añadir");
    //declaramos los lados
    var ladoA;
    var ladoB;
    var ladoC;
    //Y los tipos de triangulos que los declaramos en 0
    var equilatero = 0;
    var isosceles = 0;
    var escaleno = 0;
    //La i para el for
    var i = 0;
    for (i = 0; i < numero; i++) {
        //Pedimos los 3 lados
        ladoA = prompt("Dame el primer lado");
        ladoB = prompt("Dame el segundo lado");
        ladoC = prompt("Dame el tercer lado");
        //Repetimos lo del ejercicio anterior pero esta vez vamos añadiendo triangulos
        if (parseInt(ladoA) === parseInt(ladoB) && parseInt(ladoA) === parseInt(ladoC) && parseInt(ladoB) === parseInt(ladoC)) {
            //Si ladoA es igual a ladoB y lado A es igual a ladoC y ladoB es distinto de ladoC( Y asi con los otros casos ladoA distinto de ladoB o ladoA distinto de ladoC)
            equilatero++;
        } else if (ladoA === ladoB && ladoC !== ladoA && ladoC !== ladoA || ladoB === ladoC && ladoA !== ladoB && ladoA !== ladoC || ladoC === ladoA && ladoB !== ladoC && ladoB !== ladoA) {
            isosceles++;
            //Si todos los lados son distintos
        } else if (ladoA !== ladoB && ladoA !== ladoC && ladoB !== ladoC) {

            escaleno++;


        }

    }
    //Si el triangulo tiene 0 triangulos tambien lo comprueba
    //Si el equilatero es mayor que todos y el isosceles es mayor que el escaleno
    if (equilatero > isosceles && equilatero > escaleno && isosceles > escaleno) {
        window.alert("El triángulo con menor cantidad es el escaleno" );
        //Si el equilatero es mayor que todos y el isosceles es menor que el escaleno
    } else if (equilatero > isosceles && equilatero > escaleno && isosceles < escaleno) {
        window.alert("El triángulo con menor cantidad es el isosceles");
        //Si el isosceles es mayor que todos y el equilatero es mayor que el escaleno
    }else if (isosceles > equilatero && isosceles > escaleno && equilatero > escaleno) {
        window.alert("El triángulo con menor cantidad es el escaleno ");
        //Si el isosceles es mayor que todos y el escaleno es mayor que el equilatero
    }else if (isosceles > equilatero && isosceles > escaleno && escaleno > equilatero) {
        window.alert("El triángulo con menor cantidad es el equilatero ");
        //Si el escaleno es mayor que todos y el isosceles es mayor que el equilatero
    }else if (escaleno > equilatero && escaleno > isosceles && isosceles > equilatero) {
        window.alert("El triángulo con menor cantidad es el equilatero " );
        //Si el escaleno es mayor que todos y el isosceles es menor que el equilatero
    }else if (escaleno > equilatero && escaleno > isosceles && isosceles < equilatero) {
        window.alert("El triángulo con menor cantidad es  el isosceles");

        //Si todos son iguales
    }else if(equilatero===isosceles&&equilatero===escaleno&&escaleno===isosceles){
        window.alert("Todos tienen el mismo tamaño");
    }




    //Ponemos el resultado final
    window.alert("Has puesto " + equilatero + " triángulo/s equiláteros " + isosceles + " triangulo/s isósceles y " + escaleno + " triangulo/s escalenos")

}


//Esta era la funcion para clasificarla, pero esta implementado arriba en la otra funcion
//Esta funcion sirve sobre todo para configurar la clasificacion de triangulos y que todo estuviese bien
function clasificarTriangulosPorLados(ladoA, ladoB, ladoC) {

    //creamos la variable tipoTriangulo
    var tipoTriangulo;
    // Si ladoA es igual a lado B y a lado C, y lado B es igual a lado C(No ponemos mas porque ya hemos comparado lado A y con lado C lo mismo)
    if (parseInt(ladoA) === parseInt(ladoB) && parseInt(ladoA) === parseInt(ladoC) && parseInt(ladoB) === parseInt(ladoC)) {
        //Si ladoA es igual a ladoB y lado A es igual a ladoC y ladoB es distinto de ladoC( Y asi con los otros casos ladoA distinto de ladoB o ladoA distinto de ladoC)
        tipoTriangulo = "Equilátero";
    } else if (ladoA === ladoB && ladoC !== ladoA && ladoC !== ladoA || ladoB === ladoC && ladoA !== ladoB && ladoA !== ladoC || ladoC === ladoA && ladoB !== ladoC && ladoB !== ladoA) {
        tipoTriangulo = "Isósceles";
        //Si todos los lados son distintos
    } else if (ladoA !== ladoB && ladoA !== ladoC && ladoB !== ladoC) {

        tipoTriangulo = "Escaleno";


    }
    document.write(tipoTriangulo + "<br>");
}



