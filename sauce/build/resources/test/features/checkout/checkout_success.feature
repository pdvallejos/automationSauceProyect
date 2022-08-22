# language: es

Característica: realiza una compra exitosa
  como usuario registrado quiere comprar un producto

  Escenario: compra de usuario exitosa
    Dado que ingresa a la tienda virtual seleccionando sus productos
    Cuando realiza los pasos para el pago satisfactorio
    Entonces se mostrara un mensaje de compra exitosa.