# Ejercicio: Creación y Manipulación de una Base de Datos con Hibernate

## Esquema de Base de Datos: EmpresaHB

Se ha diseñado una base de datos llamada **EmpresaHB**, compuesta por las siguientes tablas:

### Tabla: `empregados`
| Campo          | Tipo       | Restricciones             |
|----------------|------------|---------------------------|
| Nome           | VARCHAR(25)|                           |
| Apelido1       | VARCHAR(25)|                           |
| Apelido2       | VARCHAR(25)|                           |
| NSS            | VARCHAR(15)| **Clave primaria**        |
| Salario        | FLOAT      |                           |
| DataNacemento  | DATE       |                           |
| Sexo           | CHAR(1)    |                           |

### Tabla: `departamentos`
| Campo            | Tipo       | Restricciones             |
|------------------|------------|---------------------------|
| NumDepartamento  | INT(11)    | **Clave primaria**        |
| NomeDepartamento | VARCHAR(25)| **Único, no nulo**        |

### Tabla: `proxectos`
| Campo          | Tipo       | Restricciones             |
|----------------|------------|---------------------------|
| NumProxecto    | INT(11)    | **Clave primaria**        |
| NomeProxecto   | VARCHAR(25)| **Único, no nulo**        |
| Lugar          | VARCHAR(25)|                           |

### Notas:
- Las relaciones entre tablas no se han establecido aún.

---

## Enunciado del Ejercicio

### Conexión con la Base de Datos
1. Conéctate desde tu IDE a la base de datos **EmpresaHB** y crea un nuevo proyecto usando Hibernate.
2. Hibernate debe generar automáticamente las entidades `Proxecto`, `Departamento`, y `Empregado`.

### Configuración y Anotaciones
3. Añade las anotaciones necesarias para establecer la correspondencia entre las entidades creadas y las tablas de la base de datos **EmpresaHB**:
    - Hibernate debe generar automáticamente los valores para los campos `NumDepartamento` y `NumProxecto`.
    - Los valores de estos campos deben incrementarse automáticamente, empezando por uno.

### Clase Utilitaria
4. Crea una clase llamada `HibernateUtil` para inicializar Hibernate y gestionar la conexión con la base de datos **EmpresaHB**.
5. Implementa un método en esta clase que permita crear una sesión y muestre un mensaje indicando si la creación de la sesión fue exitosa o no.

---

## Métodos a Implementar

### Operaciones CRUD
a) Crea un método que reciba el nombre de un departamento y lo inserte en la base de datos.

b) Crea un método que reciba un objeto empleado y lo inserte en la base de datos.

c) Crea un método que reciba el **NSS** de un empleado y visualice sus datos.

d) Crea un método que reciba el número de un departamento y lo elimine de la base de datos.

e) Crea un método que reciba el número de un departamento y un nombre, y cambie el nombre del departamento por el nombre introducido como parámetro.
- Todas las operaciones deben realizarse dentro de una transacción.
- Controla posibles errores que puedan ocurrir durante las operaciones.
