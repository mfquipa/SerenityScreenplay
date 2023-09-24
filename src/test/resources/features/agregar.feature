#language:es

Característica:Validar la creacion de un nuevo producto
  Yo como usuario quiero loguearme en la pagina demo serenity
  para crear un producto y validar su creacion

  Escenario: crear un nuevo producto, en la pagina Demo Serenity en la seccion Demo NortWind y validar se creacion de forma aleatoria
    Dado que el usuario esta logueado en la pagina demo Serenity
    Cuando el usuario valida que esta en Dashboard luego da click en Northwind y selecciona a Products
    Y cuando el usuario da clic al boton New Product diligencie el formulario cargando una imagen
    Entonces el usuario validara la creacion del New Product de forma aleatoria