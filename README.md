# FruitStore
Proyecto realizado para la entrega del primer taller de la cantera nivel 2. Se llevó a cabo una análisis del problema propuesto y se determinó que para las clases planteadas se podían relacionar con una tienda de fruta por lo que la creación de las nuevas clases fue basada en esta idea.

### Clases agregadas
Se agregaron 3 clases como se solicitó en el ejercicio, los cuales fueron:
- Cliente, el cual hereda de Person y crea una instancia de la clase BankAccount.
- StoreFruit, define una tienda frutas el cual posee clientes y frutas.
- Order, define un pedido realizado por el cliente.

### Modificación a las clases propuestas
Se hicieron los siguientes cambios pequeños a las clases propuestas:
- En los atributos en la clase Person se cambió su acceso de public a protected.
- Se agregaron nuevos métodos a la clase BankAccount para establecer y obtener el valor del atributo activated.
