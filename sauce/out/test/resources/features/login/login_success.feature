# language: es

Característica: ingresar a la tienda satisfactoriamente
  como usuario registrado necesito ingresar a la tienda virtual

  Escenario: ingreso de usuario exitoso
    Dado que navega hasta el login de la web
    Cuando ingresa las credenciales correctas e ingresa
    Entonces se visualizaran los productos de la tienda virtual.