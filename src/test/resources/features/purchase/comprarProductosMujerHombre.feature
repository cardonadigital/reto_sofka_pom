# language: es
Característica:  Comprar productos

  Escenario: Comprar productos de hombre y mujer
    Dado que el usuario se dirige al modulo de women
    Y agregue 2 productos al carrito de compras
    Y valla al modulo de hombres
    Y agregue otros 2 productos al carrito de compras
    Cuando realize el checkout rellenando los campos obligatorios
    Y confirme la compra
    Entonces podrá ver el siguiente mensaje  : "Thank you for your purchase".