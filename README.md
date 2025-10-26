# Proyecto de ejemplo de Maven
## Proyecto: Gestión de biblioteca

- Una **biblioteca** _tiene_ **copias** de **libros**. Estos últimos se caracterizan por su **nombre**, **tipo** (novela, teatro, poesía, ensayo), **editorial**, **año** y **autor**.
- Los **autores** se caracterizan por su **nombre**, **nacionalidad** y **fecha de nacimiento**.
Cada **copia** tiene un **identificador**, y puede estar en la **biblioteca**, **prestada**, con **retraso** o en **reparación**.
- Los **lectores** pueden tener un máximo de 3 **libros** en **préstamo**.
Cada **libro** se presta un máximo de 30 días, por cada día de retraso, se impone una **multa**  de dos días sin posibilidad de pedir un nuevo libro.

Realiza un diagrama de clases y añade los métodos necesarios para realizar el préstamo y devolución de libros.

## modelo de datos

![Modelo de Datos](uml/modelo.png)