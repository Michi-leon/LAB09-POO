# Laboratorio 9 — Tienda de belleza

## 1. Clases abstractas

### Producto.java
**Atributos privados:**
- `idProducto`
- `nombre`
- `precioCompra`
- `stockActual`
- `stockMinimo`

**Métodos:**
- Constructor
- Getters y setters
- `tieneStockBajo()`
- `mostrarTipo()` (abstracto)

### DetalleVenta.java
**Atributos privados:**
- `idDetalle`
- `cantidad`
- `precioUnitario`
- `descuento`

**Métodos:**
- Constructor
- Getters y setters
- `calcularSubtotal()` (abstracto)

## 2. Clases hijas

### ProductoVenta.java
- Atributo: `precioVenta`
- Constructor
- Getters y setters
- Sobrescribir `mostrarTipo()`

### Insumo.java
- Constructor
- Sobrescribir `mostrarTipo()`

### ProductoMixto.java
- Atributo: `precioVenta`
- Constructor
- Getters y setters
- Sobrescribir `mostrarTipo()`

### DetalleVentaProducto.java
- Referencia al producto correspondiente
- Constructor
- Sobrescribir `calcularSubtotal()`

### DetalleVentaServicio.java
- Referencia al servicio correspondiente
- Constructor
- Sobrescribir `calcularSubtotal()`

## 3. Interfaz

### CalculableSubtotal.java
**Método:**
- `calcularSubtotal()`

La interfaz establece el contrato para calcular subtotales. Las clases concretas que la implementen deberán definir ese método.

## 4. Clases auxiliares

### Servicio.java
**Atributos:** `idServicio`, `nombre`, `precioHabitual`.

**Métodos:** constructor, getters y setters.

### Venta.java
**Métodos:**
- `agregarDetalle()`
- `eliminarDetalle()`
- `calcularTotal()`
- `mostrarDetalles()`

Mantendrá una colección de detalles de venta.

### GestorProductos.java
**Métodos:**
- `registrarProducto()`
- `listarProductos()`
- `buscarProducto()`
- `modificarProducto()`
- `eliminarProducto()`
- `listarStockBajo()`

Administrará los productos utilizando una colección `ArrayList<Producto>`.

## 5. Menú de Main.java

```text
===== TIENDA DE BELLEZA =====
1. Registrar producto
2. Listar productos
3. Buscar producto
4. Modificar producto
5. Eliminar producto
6. Consultar productos con stock bajo
7. Crear venta
8. Agregar detalle a la venta
9. Mostrar detalles de la venta
10. Calcular total de la venta
0. Salir
```

## 6. Entregables del laboratorio 9

1. **Descripción del problema:** documento breve que explique el negocio, la necesidad identificada y la solución propuesta.
2. **Diagrama de clases UML:** debe mostrar las clases abstractas, las clases hijas, la interfaz, los atributos, los métodos y las relaciones.
3. **Código fuente:** implementación completa del programa Java.

**Importante:** la guía también indica que se debe enviar un único archivo de texto con el código de todas las clases utilizadas por cada ejercicio. Por tanto, no basta con entregar únicamente la carpeta del proyecto si el docente solicita ese archivo de texto.
