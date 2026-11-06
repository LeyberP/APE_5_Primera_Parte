<div align="center">

# ☕ APE 5 – Manejo de ficheros en Java

### 📂 Crear, escribir, leer y registrar datos en archivos con `java.io`

![Java](https://img.shields.io/badge/Java-8%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/POO-Java-red?style=for-the-badge)
![Grupo](https://img.shields.io/badge/Grupo-6-purple?style=for-the-badge)

![UTA](https://img.shields.io/badge/Universidad-T%C3%A9cnica%20de%20Ambato-8B0000?style=flat-square)
![FISEI](https://img.shields.io/badge/Facultad-FISEI-darkblue?style=flat-square)
![Carrera](https://img.shields.io/badge/Carrera-Software-blue?style=flat-square)
![Ciclo](https://img.shields.io/badge/Ciclo-jul%202026%20%E2%80%93%20dic%202026-teal?style=flat-square)

![Parte 1](https://img.shields.io/badge/Parte%201-3%20ejercicios-success?style=flat-square)
![Parte 2](https://img.shields.io/badge/Parte%202-3%20ejercicios-success?style=flat-square)
![Dependencias](https://img.shields.io/badge/dependencias-ninguna-brightgreen?style=flat-square)

**🏛️ Universidad Técnica de Ambato · Facultad de Ingeniería en Sistemas, Electrónica e Industrial**

</div>

---

## 📋 Datos generales

| 🏷️ Campo | 📝 Detalle |
|---|---|
| 👤 **Estudiante** | Leyber Peñafiel |
| 👨‍🏫 **Docente** | Ing. José Caiza |
| 🎓 **Carrera** | Software |
| 📚 **Asignatura** | Programación Orientada a Objetos (Java) · Grupo 6 |
| 🏫 **Nivel / Curso** | 1 / B |
| 🗓️ **Ciclo académico** | Julio 2026 – Diciembre 2026 |
| 📅 **Fecha Parte 1** | 04/11/2026 |
| 📅 **Fecha Parte 2** | 05/11/2026 |
| 🔗 **Repositorio** | [LeyberP/APE_5_Primera_Parte](https://github.com/LeyberP/APE_5_Primera_Parte) |

---

<a id="índice"></a>

## 🧭 Índice

- [🚀 Navegación rápida](#navegación-rápida)
- [📖 Descripción general](#descripción-general)
- [🗂️ Estructura del repositorio](#estructura-del-repositorio)
- [🧰 Requisitos previos](#requisitos-previos)
- [📘 Parte 1 – Operaciones básicas con ficheros](#parte-1)
  - [Ejercicio 1. Crear un fichero en Java](#ejercicio-1-crear-un-fichero-en-java)
  - [Ejercicio 2. Escribir información en un fichero](#ejercicio-2-escribir-información-en-un-fichero)
  - [Ejercicio 3. Eliminar un fichero en Java](#ejercicio-3-eliminar-un-fichero-en-java)
- [📗 Parte 2 – Registro de datos con `BufferedWriter`](#parte-2)
  - [Ejercicio 1. Registro de estudiantes y calificaciones](#p2-ejercicio-1)
  - [Ejercicio 2. Registro de productos con modo *append*](#p2-ejercicio-2)
  - [Ejercicio 3. Sistema de registro de ventas](#p2-ejercicio-3)
- [▶️ Instrucciones de ejecución](#instrucciones-de-ejecución)
- [🧠 Conceptos aplicados](#conceptos-aplicados)
- [⚠️ Notas importantes](#notas-importantes)
- [📄 Documentación](#documentación)
- [👥 Integrantes del grupo](#integrantes)
- [✍️ Autor](#autor)

---

<a id="navegación-rápida"></a>

## 🚀 Navegación rápida

| Parte | Categoría | Descripción | Enlaces |
|:-:|---|---|---|
| 📘 1 | Ejercicio 1 | Crear `curso.txt` | [Enunciado y resolución](#ejercicio-1-crear-un-fichero-en-java) · [`CrearCurso.java`](Codigos/CrearCurso.java) |
| 📘 1 | Ejercicio 2 | Escribir en `estudiantes.txt` | [Enunciado y resolución](#ejercicio-2-escribir-información-en-un-fichero) · [`EscribirArchivo.java`](Codigos/EscribirArchivo.java) |
| 📘 1 | Ejercicio 3 | Eliminar `estudiantes.txt` | [Enunciado y resolución](#ejercicio-3-eliminar-un-fichero-en-java) · [`EliminarArchivo.java`](Codigos/EliminarArchivo.java) |
| 📗 2 | Ejercicio 1 | Registrar 3 estudiantes y sus calificaciones en `estudiantes.txt` | [Enunciado y resolución](#p2-ejercicio-1) · [`Ejercicio1.java`](Codigos/Ejercicio1.java) |
| 📗 2 | Ejercicio 2 | Registrar productos en `productos.txt` (modo *append*) | [Enunciado y resolución](#p2-ejercicio-2) · [`Ejercicio2.java`](Codigos/Ejercicio2.java) |
| 📗 2 | Ejercicio 3 | Registrar ventas con descuento en `ventas.txt` | [Enunciado y resolución](#p2-ejercicio-3) · [`Ejercicio3.java`](Codigos/Ejercicio3.java) |
| 💻 | Código fuente | Los seis programas Java | [`Codigos/`](Codigos/) |
| 📄 | Documentación | Enunciados e informes de resolución de ambas partes | [`docs/`](docs/) |
| ▶️ | Ejecución | Cómo compilar y correr los programas | [Instrucciones de ejecución](#instrucciones-de-ejecución) |

---

<a id="descripción-general"></a>

## 📖 Descripción general

Este repositorio contiene la **APE 5** de Programación Orientada a Objetos, dividida en dos partes. Todos los programas usan únicamente la API estándar de Java (`java.io` y `java.util.Scanner`): no hay librerías externas ni gestores de dependencias; basta con tener un JDK instalado.

- 📘 **Parte 1:** tres programas que practican las operaciones básicas sobre archivos de texto: **crear**, **escribir** y **eliminar** un fichero.
- 📗 **Parte 2:** tres programas que **registran datos ingresados por teclado** en archivos usando `BufferedWriter`, con cálculos, bucles y modo *append*.

### 📘 Parte 1

| N.º | Programa | Qué hace | Archivo que utiliza |
|:-:|---|---|---|
| 1 | [`CrearCurso.java`](Codigos/CrearCurso.java) | Crea un archivo vacío e informa si se creó o ya existía | `curso.txt` |
| 2 | [`EscribirArchivo.java`](Codigos/EscribirArchivo.java) | Lee un mensaje por teclado y lo agrega al final del archivo | `estudiantes.txt` |
| 3 | [`EliminarArchivo.java`](Codigos/EliminarArchivo.java) | Elimina el archivo e informa del resultado | `estudiantes.txt` |

### 📗 Parte 2

| N.º | Programa | Qué hace | Archivo que utiliza |
|:-:|---|---|---|
| 1 | [`Ejercicio1.java`](Codigos/Ejercicio1.java) | Pide nombre y calificación de 3 estudiantes y los guarda (dos líneas por estudiante) | `estudiantes.txt` |
| 2 | [`Ejercicio2.java`](Codigos/Ejercicio2.java) | Registra productos, calcula precio × cantidad y los agrega sin borrar los anteriores | `productos.txt` |
| 3 | [`Ejercicio3.java`](Codigos/Ejercicio3.java) | Registra ventas hasta escribir `fin`, aplica 10 % de descuento si el subtotal ≥ $100 y guarda el total acumulado | `ventas.txt` |

[↑ Volver al índice](#índice)

---

<a id="estructura-del-repositorio"></a>

## 🗂️ Estructura del repositorio

```text
APE_5_Primera_Parte/
├── README.md                          # Este documento (descripción principal)
├── Codigos/                           # Código fuente de los ejercicios
│   ├── CrearCurso.java                # Parte 1 · Ejercicio 1
│   ├── EscribirArchivo.java           # Parte 1 · Ejercicio 2
│   ├── EliminarArchivo.java           # Parte 1 · Ejercicio 3
│   ├── Ejercicio1.java                # Parte 2 · Ejercicio 1
│   ├── Ejercicio2.java                # Parte 2 · Ejercicio 2
│   ├── Ejercicio3.java                # Parte 2 · Ejercicio 3
│   └── readme.md
└── docs/                              # Documentos de la actividad
    ├── APE 5 primera parte.docx       # Parte 1 · Enunciado de los ejercicios
    ├── Ape 5 resolución.pdf           # Parte 1 · Informe con la resolución
    ├── Ejercicios de APE clase 2.pdf  # Parte 2 · Enunciado de los ejercicios
    ├── Ape 5 resolución Parte2.pdf    # Parte 2 · Informe con la resolución
    └── readme.md
```

| Ruta | Parte | Contenido |
|---|:-:|---|
| [`Codigos/`](Codigos/) | 1 y 2 | Seis clases Java, cada una con su propio `main`, sin paquetes ni dependencias entre sí |
| [`Codigos/CrearCurso.java`](Codigos/CrearCurso.java) | 📘 1 | Solución del Ejercicio 1 |
| [`Codigos/EscribirArchivo.java`](Codigos/EscribirArchivo.java) | 📘 1 | Solución del Ejercicio 2 |
| [`Codigos/EliminarArchivo.java`](Codigos/EliminarArchivo.java) | 📘 1 | Solución del Ejercicio 3 |
| [`Codigos/Ejercicio1.java`](Codigos/Ejercicio1.java) | 📗 2 | Solución del Ejercicio 1 |
| [`Codigos/Ejercicio2.java`](Codigos/Ejercicio2.java) | 📗 2 | Solución del Ejercicio 2 |
| [`Codigos/Ejercicio3.java`](Codigos/Ejercicio3.java) | 📗 2 | Solución del Ejercicio 3 |
| [`docs/`](docs/) | 1 y 2 | Material de la actividad |
| [`docs/APE 5 primera parte.docx`](docs/APE%205%20primera%20parte.docx) | 📘 1 | Enunciado original |
| [`docs/Ape 5 resolución.pdf`](docs/Ape%205%20resoluci%C3%B3n.pdf) | 📘 1 | Informe entregado, con las capturas del código |
| [`docs/Ejercicios de APE clase 2.pdf`](docs/Ejercicios%20de%20APE%20clase%202.pdf) | 📗 2 | Enunciado original (05/11/2026) |
| [`docs/Ape 5 resolución Parte2.pdf`](docs/Ape%205%20resoluci%C3%B3n%20Parte2.pdf) | 📗 2 | Informe entregado, con las capturas del código |

Cada carpeta incluye su propio `readme.md` con más detalle: [`Codigos/readme.md`](Codigos/readme.md) y [`docs/readme.md`](docs/readme.md).

> 💡 Los archivos `curso.txt`, `estudiantes.txt`, `productos.txt` y `ventas.txt` **no forman parte del repositorio**: los generan los programas al ejecutarse, en la carpeta desde la que se lanzan.

[↑ Volver al índice](#índice)

---

<a id="requisitos-previos"></a>

## 🧰 Requisitos previos

| Requisito | Detalle |
|---|---|
| ☕ **JDK** | Java 8 o superior (se verificó con OpenJDK 21) |
| 💻 **Terminal** | Bash, PowerShell o CMD. También sirve cualquier IDE (IntelliJ IDEA, Eclipse, VS Code, NetBeans) |
| 🌿 **Git** | Opcional; solo para clonar. También se puede descargar el ZIP desde GitHub |
| 📦 **Librerías externas** | Ninguna: solo `java.io` y `java.util.Scanner` |

Comprobar que Java está disponible:

```bash
java -version
javac -version
```

[↑ Volver al índice](#índice)

---

<a id="parte-1"></a>
<a id="ejercicios"></a>

## 📘 Parte 1 – Operaciones básicas con ficheros

> 📄 Enunciado: [`APE 5 primera parte.docx`](docs/APE%205%20primera%20parte.docx) · 📝 Resolución: [`Ape 5 resolución.pdf`](docs/Ape%205%20resoluci%C3%B3n.pdf) · 📅 04/11/2026

| Ejercicio | Tema | Archivo Java | Archivo de texto |
|:-:|---|---|---|
| 1 | Crear un fichero | [`CrearCurso.java`](Codigos/CrearCurso.java) | `curso.txt` |
| 2 | Escribir en un fichero | [`EscribirArchivo.java`](Codigos/EscribirArchivo.java) | `estudiantes.txt` |
| 3 | Eliminar un fichero | [`EliminarArchivo.java`](Codigos/EliminarArchivo.java) | `estudiantes.txt` |

<a id="ejercicio-1-crear-un-fichero-en-java"></a>

### 🟢 Ejercicio 1. Crear un fichero en Java

**📌 Enunciado**

Desarrollar un programa en Java que permita crear un archivo de texto llamado `curso.txt`.

**📋 Indicaciones (requisitos)**

1. Importar las clases necesarias para trabajar con archivos.
2. Crear un objeto de tipo `File`.
3. Utilizar el método `createNewFile()` para crear el archivo.
4. Comprobar si el archivo se creó correctamente o si ya existe.
5. Mostrar el nombre del archivo utilizando `getName()`.
6. Utilizar `try-catch` para controlar posibles errores.

**🧩 Clases y métodos sugeridos:** `File`, `IOException`, `createNewFile()`, `getName()`

**💻 Resolución** · Archivo: [`Codigos/CrearCurso.java`](Codigos/CrearCurso.java)

```java
import java.io.File;
import java.io.IOException;

public class CrearCurso {
    public static void main(String[] args) {
        try {
            File archivo = new File("curso.txt");

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado correctamente: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe: " + archivo.getName());
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }
}
```

**🔍 Descripción de la solución**

Se crea un objeto `File` que apunta a `curso.txt`. El método `createNewFile()` devuelve `true` si el archivo no existía y fue creado, y `false` si ya existía. En los dos mensajes se muestra el nombre mediante `getName()`. Como `createNewFile()` puede lanzar una `IOException`, toda la lógica está dentro de un bloque `try-catch`.

**✅ Cumplimiento de los requisitos**

| # | Requisito | Dónde se cumple | Estado |
|:-:|---|---|:-:|
| 1 | Importar clases | Líneas 1–2: `File`, `IOException` | ✅ |
| 2 | Objeto `File` | Línea 7 | ✅ |
| 3 | `createNewFile()` | Línea 9 | ✅ |
| 4 | Comprobar creación / existencia | `if-else`, líneas 9–13 | ✅ |
| 5 | Mostrar el nombre con `getName()` | Líneas 10 y 12 | ✅ |
| 6 | `try-catch` | Líneas 6 y 15–18 | ✅ |

**🖥️ Salida de ejemplo**

```text
# Primera ejecución
Archivo creado correctamente: curso.txt

# Segunda ejecución (el archivo ya existe)
El archivo ya existe: curso.txt
```

[↑ Volver al índice](#índice)

---

<a id="ejercicio-2-escribir-información-en-un-fichero"></a>

### 🟡 Ejercicio 2. Escribir información en un fichero

**📌 Enunciado**

Desarrollar un programa en Java que permita ingresar un mensaje por teclado y almacenarlo en un archivo de texto existente llamado `estudiantes.txt`.

**📋 Indicaciones (requisitos)**

1. Importar las clases necesarias.
2. Crear un objeto `Scanner` para ingresar información por teclado.
3. Solicitar al usuario que escriba un mensaje.
4. Utilizar `FileWriter` para abrir el archivo `estudiantes.txt`.
5. Utilizar el parámetro `true` para conservar la información anterior y agregar el nuevo mensaje al final.
6. Utilizar el método `write()` para guardar el mensaje.
7. Cerrar el archivo utilizando `close()`.
8. Mostrar un mensaje indicando que la información se guardó correctamente.
9. Controlar posibles errores mediante `try-catch`.

**🧩 Clases y métodos sugeridos:** `Scanner`, `FileWriter`, `IOException`, `write()`, `close()`

> **Nota del enunciado:** el archivo `estudiantes.txt` debe existir previamente.

**💻 Resolución** · Archivo: [`Codigos/EscribirArchivo.java`](Codigos/EscribirArchivo.java)

```java
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirArchivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Escribe un mensaje: ");
            String mensaje = teclado.nextLine();

            FileWriter escritor = new FileWriter("estudiantes.txt", true);

            escritor.write(mensaje + "\n");

            escritor.close();

            System.out.println("La información se guardó correctamente.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        teclado.close();
    }
}
```

**🔍 Descripción de la solución**

Un `Scanner` sobre `System.in` lee con `nextLine()` la línea completa. Se abre `estudiantes.txt` con `new FileWriter("estudiantes.txt", true)`: el segundo argumento `true` activa el **modo *append***. Se escribe el mensaje seguido de `"\n"`, se cierra con `close()` y se confirma por pantalla.

**✅ Cumplimiento de los requisitos**

| # | Requisito | Dónde se cumple | Estado |
|:-:|---|---|:-:|
| 1 | Importar clases | Líneas 1–3 | ✅ |
| 2 | Objeto `Scanner` | Línea 7 | ✅ |
| 3 | Solicitar el mensaje | Líneas 10–11 | ✅ |
| 4 | `FileWriter` sobre `estudiantes.txt` | Línea 13 | ✅ |
| 5 | Parámetro `true` | Línea 13 | ✅ |
| 6 | `write()` | Línea 15 | ✅ |
| 7 | `close()` | Línea 17 | ✅ |
| 8 | Mensaje de confirmación | Línea 19 | ✅ |
| 9 | `try-catch` | Líneas 9 y 21–24 | ✅ |

**🖥️ Salida de ejemplo**

```text
Escribe un mensaje: Mensaje de prueba A
La información se guardó correctamente.
```

[↑ Volver al índice](#índice)

---

<a id="ejercicio-3-eliminar-un-fichero-en-java"></a>

### 🔴 Ejercicio 3. Eliminar un fichero en Java

**📌 Enunciado**

Desarrollar un programa en Java que permita eliminar el archivo de texto `estudiantes.txt`.

**📋 Indicaciones (requisitos)**

1. Importar la clase necesaria para trabajar con archivos.
2. Crear un objeto de tipo `File` indicando el nombre del archivo que se desea eliminar.
3. Utilizar el método `delete()` para intentar eliminar el archivo.
4. Comprobar si la eliminación se realizó correctamente.
5. Si el archivo se eliminó, mostrar un mensaje de confirmación.
6. Si no se pudo eliminar, mostrar un mensaje indicando el problema.

**🧩 Clases y métodos sugeridos:** `File`, `delete()`, `if-else`, `System.out.println()`

**💻 Resolución** · Archivo: [`Codigos/EliminarArchivo.java`](Codigos/EliminarArchivo.java)

```java
import java.io.File;

public class EliminarArchivo {
    public static void main(String[] args) {
        File archivo = new File("estudiantes.txt");

        if (archivo.delete()) {
            System.out.println("El archivo " + archivo.getName() + " se eliminó correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo. Puede que no exista o que esté en uso.");
        }
    }
}
```

**🔍 Descripción de la solución**

Se crea un `File` que representa a `estudiantes.txt` y se invoca `delete()`, que devuelve `true` si fue eliminado y `false` en caso contrario. `delete()` no lanza `IOException`, por lo que no hace falta `try-catch`.

**✅ Cumplimiento de los requisitos**

| # | Requisito | Dónde se cumple | Estado |
|:-:|---|---|:-:|
| 1 | Importar `File` | Línea 1 | ✅ |
| 2 | Objeto `File` con el nombre | Línea 5 | ✅ |
| 3 | `delete()` | Línea 7 | ✅ |
| 4 | Comprobar si se eliminó | `if`, línea 7 | ✅ |
| 5 | Mensaje de confirmación | Línea 8 | ✅ |
| 6 | Mensaje si no se pudo eliminar | Línea 10 | ✅ |

**🖥️ Salida de ejemplo**

```text
# Primera ejecución (el archivo existe)
El archivo estudiantes.txt se eliminó correctamente.

# Segunda ejecución (el archivo ya no existe)
No se pudo eliminar el archivo. Puede que no exista o que esté en uso.
```

[↑ Volver al índice](#índice)

---

<a id="parte-2"></a>

## 📗 Parte 2 – Registro de datos con `BufferedWriter`

> 📄 Enunciado: [`Ejercicios de APE clase 2.pdf`](docs/Ejercicios%20de%20APE%20clase%202.pdf) · 📝 Resolución: [`Ape 5 resolución Parte2.pdf`](docs/Ape%205%20resoluci%C3%B3n%20Parte2.pdf) · 📅 05/11/2026

| Ejercicio | Tema | Nivel | Archivo Java | Archivo de texto |
|:-:|---|:-:|---|---|
| 1 | Registro de estudiantes y calificaciones | Básico | [`Ejercicio1.java`](Codigos/Ejercicio1.java) | `estudiantes.txt` |
| 2 | Registro de productos con modo *append* | Intermedio | [`Ejercicio2.java`](Codigos/Ejercicio2.java) | `productos.txt` |
| 3 | Sistema de registro de ventas | Intermedio | [`Ejercicio3.java`](Codigos/Ejercicio3.java) | `ventas.txt` |

<a id="p2-ejercicio-1"></a>

### 🟢 Ejercicio 1. Registro de estudiantes y calificaciones

**📌 Enunciado**

Desarrollar un programa en Java que permita registrar los datos de 3 estudiantes y guardar la información en un archivo llamado `estudiantes.txt`.

**📋 Indicaciones (requisitos)**

1. Solicitar el nombre del estudiante.
2. Solicitar su calificación.
3. Guardar ambos datos en el archivo.
4. Cada estudiante debe ocupar dos líneas.
5. Utilizar `Scanner`, `BufferedWriter` y `FileWriter`.
6. Cerrar correctamente el archivo.

**🧩 Clases y métodos utilizados:** `Scanner`, `BufferedWriter`, `FileWriter`, `IOException`, `write()`, `newLine()`, *try-with-resources*

**💻 Resolución** · Archivo: [`Codigos/Ejercicio1.java`](Codigos/Ejercicio1.java)

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("estudiantes.txt"))) {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Nombre del estudiante " + i + ": ");
                String nombre = sc.nextLine();

                System.out.print("Calificación de " + nombre + ": ");
                String calificacion = sc.nextLine();

                bw.write(nombre);
                bw.newLine();
                bw.write(calificacion);
                bw.newLine();
            }
            System.out.println("Datos guardados en estudiantes.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        sc.close();
    }
}
```

**🔍 Descripción de la solución**

Se abre `estudiantes.txt` con `BufferedWriter` dentro de un bloque **try-with-resources**: el archivo se cierra automáticamente. Un bucle `for` repite 3 veces; en cada vuelta el `Scanner` lee nombre y calificación. Cada dato se escribe con `write()` seguido de `newLine()`, por lo que **cada estudiante ocupa dos líneas**. Como el `FileWriter` se abre sin `true`, cada ejecución crea el archivo de nuevo.

**✅ Cumplimiento de los requisitos**

| # | Requisito | Dónde se cumple | Estado |
|:-:|---|---|:-:|
| 1 | Solicitar el nombre | Líneas 12–13 | ✅ |
| 2 | Solicitar la calificación | Líneas 15–16 | ✅ |
| 3 | Guardar ambos datos | Líneas 18 y 20 | ✅ |
| 4 | Dos líneas por estudiante | `newLine()` líneas 19 y 21 | ✅ |
| 5 | `Scanner`, `BufferedWriter`, `FileWriter` | Líneas 8 y 10 | ✅ |
| 6 | Cerrar correctamente | *try-with-resources* línea 10 | ✅ |

**🖥️ Salida de ejemplo**

```text
Nombre del estudiante 1: Ana
Calificación de Ana: 9.5
Nombre del estudiante 2: Luis
Calificación de Luis: 8
Nombre del estudiante 3: Maria
Calificación de Maria: 10
Datos guardados en estudiantes.txt
```

Contenido de `estudiantes.txt`:

```text
Ana
9.5
Luis
8
Maria
10
```

[↑ Volver al índice](#índice)

---

<a id="p2-ejercicio-2"></a>

### 🟡 Ejercicio 2. Registro de productos con modo *append*

**📌 Enunciado**

Desarrollar un programa que permita registrar productos en un archivo llamado `productos.txt`.

**📋 Indicaciones (requisitos)**

1. Solicitar el nombre del producto.
2. Solicitar su precio.
3. Solicitar la cantidad disponible.
4. Calcular el valor total del producto (precio × cantidad).
5. Guardar los resultados en el archivo.
6. Permitir registrar nuevos productos sin borrar los registros anteriores.
7. Utilizar `BufferedWriter` y modo *append*.

**🧩 Clases y métodos utilizados:** `Scanner`, `BufferedWriter`, `FileWriter(nombre, true)`, `Double.parseDouble()`, `Integer.parseInt()`, `do-while`, `NumberFormatException`

**💻 Resolución** · Archivo: [`Codigos/Ejercicio2.java`](Codigos/Ejercicio2.java)

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("productos.txt", true))) {
            do {
                System.out.print("Nombre del producto: ");
                String nombre = sc.nextLine();

                System.out.print("Precio: ");
                double precio = Double.parseDouble(sc.nextLine());

                System.out.print("Cantidad disponible: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                double total = precio * cantidad;

                bw.write("Producto: " + nombre);
                bw.newLine();
                bw.write("Precio: " + precio);
                bw.newLine();
                bw.write("Cantidad: " + cantidad);
                bw.newLine();
                bw.write("Valor total: " + total);
                bw.newLine();
                bw.write("------------------------");
                bw.newLine();

                System.out.println("Valor total: $" + total);
                System.out.print("¿Registrar otro producto? (s/n): ");
                continuar = sc.nextLine();
            } while (continuar.equalsIgnoreCase("s"));

            System.out.println("Datos guardados en productos.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: ingresa un número válido.");
        }

        sc.close();
    }
}
```

**🔍 Descripción de la solución**

El archivo se abre con `new FileWriter("productos.txt", true)` en **modo *append***. Un bucle `do-while` pide nombre, precio y cantidad; calcula `total = precio * cantidad`, escribe un bloque con los cuatro datos y un separador, y pregunta si continuar. Si se ingresa un número no válido se captura `NumberFormatException`.

**✅ Cumplimiento de los requisitos**

| # | Requisito | Dónde se cumple | Estado |
|:-:|---|---|:-:|
| 1 | Solicitar el nombre | Líneas 14–15 | ✅ |
| 2 | Solicitar el precio | Líneas 17–18 | ✅ |
| 3 | Solicitar la cantidad | Líneas 20–21 | ✅ |
| 4 | Calcular precio × cantidad | Línea 23 | ✅ |
| 5 | Guardar los resultados | Líneas 25–34 | ✅ |
| 6 | Sin borrar registros anteriores | `do-while` + modo *append* | ✅ |
| 7 | `BufferedWriter` y modo *append* | Línea 11 | ✅ |

**🖥️ Salida de ejemplo**

```text
Nombre del producto: Lapiz
Precio: 0.5
Cantidad disponible: 100
Valor total: $50.0
¿Registrar otro producto? (s/n): n
Datos guardados en productos.txt
```

[↑ Volver al índice](#índice)

---

<a id="p2-ejercicio-3"></a>

### 🔴 Ejercicio 3. Sistema de registro de ventas

**📌 Enunciado**

Desarrollar un programa en Java que permita registrar las ventas de una tienda y guardar la información en un archivo llamado `ventas.txt`.

**📋 Indicaciones (requisitos)**

1. Solicitar el nombre del producto.
2. Solicitar el precio y la cantidad vendida.
3. Calcular el subtotal de cada venta.
4. Si el subtotal es mayor o igual a $100, aplicar un descuento del 10 %.
5. Mostrar el total a pagar.
6. Permitir registrar varios productos hasta que el usuario escriba `fin`.
7. Guardar cada venta en el archivo sin eliminar los registros anteriores.
8. Al finalizar, guardar el total acumulado de las ventas realizadas.

**🧩 Clases y métodos utilizados:** `Scanner`, `BufferedWriter`, `FileWriter(nombre, true)`, `while (true)` + `break`, `equalsIgnoreCase()`, `if`, `NumberFormatException`

**💻 Resolución** · Archivo: [`Codigos/Ejercicio3.java`](Codigos/Ejercicio3.java)

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalAcumulado = 0;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true))) {
            while (true) {
                System.out.print("Nombre del producto (o 'fin' para terminar): ");
                String nombre = sc.nextLine();
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Precio: ");
                double precio = Double.parseDouble(sc.nextLine());

                System.out.print("Cantidad vendida: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                double subtotal = precio * cantidad;
                double descuento = 0;
                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }
                double totalPagar = subtotal - descuento;

                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + totalPagar);

                bw.write("Producto: " + nombre);
                bw.newLine();
                bw.write("Precio: " + precio + " | Cantidad: " + cantidad);
                bw.newLine();
                bw.write("Subtotal: " + subtotal + " | Descuento: " + descuento
                        + " | Total a pagar: " + totalPagar);
                bw.newLine();
                bw.write("------------------------");
                bw.newLine();

                totalAcumulado += totalPagar;
            }

            bw.write("TOTAL ACUMULADO DE VENTAS: $" + totalAcumulado);
            bw.newLine();
            bw.write("========================");
            bw.newLine();

            System.out.println("Total acumulado: $" + totalAcumulado);
            System.out.println("Datos guardados en ventas.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: ingresa un número válido.");
        }

        sc.close();
    }
}
```

**🔍 Descripción de la solución**

`ventas.txt` se abre en **modo *append***. Un `while (true)` termina con `break` cuando el usuario escribe `fin`. Para cada venta se calcula el subtotal y, si es **≥ $100**, se aplica un **descuento del 10 %**. Al salir del bucle se guarda la línea `TOTAL ACUMULADO DE VENTAS`.

**✅ Cumplimiento de los requisitos**

| # | Requisito | Dónde se cumple | Estado |
|:-:|---|---|:-:|
| 1 | Solicitar el nombre | Líneas 13–14 | ✅ |
| 2 | Solicitar precio y cantidad | Líneas 19–23 | ✅ |
| 3 | Calcular el subtotal | Línea 25 | ✅ |
| 4 | Descuento 10 % si subtotal ≥ $100 | Líneas 26–29 | ✅ |
| 5 | Mostrar el total a pagar | Líneas 32–34 | ✅ |
| 6 | Repetir hasta escribir `fin` | `while (true)` + `break` | ✅ |
| 7 | Sin eliminar registros anteriores | Modo *append* línea 11 | ✅ |
| 8 | Guardar total acumulado al finalizar | Líneas 46–49 | ✅ |

**🖥️ Salida de ejemplo**

```text
Nombre del producto (o 'fin' para terminar): Teclado
Precio: 25
Cantidad vendida: 4
Subtotal: $100.0
Descuento: $10.0
Total a pagar: $90.0
Nombre del producto (o 'fin' para terminar): fin
Total acumulado: $90.0
Datos guardados en ventas.txt
```

[↑ Volver al índice](#índice)

---

<a id="instrucciones-de-ejecución"></a>

## ▶️ Instrucciones de ejecución

Los seis programas están en [`Codigos/`](Codigos/) y se ejecutan **desde esa carpeta**.

### 1️⃣ Obtener el proyecto

```bash
git clone https://github.com/LeyberP/APE_5_Primera_Parte.git
cd APE_5_Primera_Parte/Codigos
```

### 2️⃣ Compilar

```bash
javac *.java
```

### 3️⃣ Ejecutar la Parte 1 (en orden recomendado)

```bash
java CrearCurso          # Ejercicio 1: crea curso.txt
touch estudiantes.txt    # Preparación para Ejercicio 2
java EscribirArchivo     # Ejercicio 2: escribe en estudiantes.txt
java EliminarArchivo     # Ejercicio 3: elimina estudiantes.txt
```

### 4️⃣ Ejecutar la Parte 2

```bash
java Ejercicio1          # Registra 3 estudiantes en estudiantes.txt
java Ejercicio2          # Registra productos en productos.txt
java Ejercicio3          # Registra ventas en ventas.txt
```

### 📊 Resumen por ejercicio

| Parte | Ejercicio | Ejecutar | Efecto |
|:-:|:-:|---|---|
| 📘 1 | 1 | `java CrearCurso` | Crea `curso.txt` |
| 📘 1 | 2 | `java EscribirArchivo` | Agrega mensaje a `estudiantes.txt` |
| 📘 1 | 3 | `java EliminarArchivo` | Elimina `estudiantes.txt` |
| 📗 2 | 1 | `java Ejercicio1` | Guarda 3 estudiantes en `estudiantes.txt` |
| 📗 2 | 2 | `java Ejercicio2` | Agrega productos a `productos.txt` |
| 📗 2 | 3 | `java Ejercicio3` | Agrega ventas y total a `ventas.txt` |

[↑ Volver al índice](#índice)

---

<a id="conceptos-aplicados"></a>

## 🧠 Conceptos aplicados

| Clase / método | Para qué se usa | Parte 1 | Parte 2 |
|---|---|:-:|:-:|
| `java.io.File` | Representa la ruta de un archivo | Ej. 1, 3 | — |
| `File.createNewFile()` | Crea un archivo vacío | Ej. 1 | — |
| `File.delete()` | Elimina el archivo | Ej. 3 | — |
| `java.util.Scanner` / `nextLine()` | Lee línea completa desde teclado | Ej. 2 | Ej. 1, 2, 3 |
| `java.io.FileWriter(nombre)` | Abre el archivo sobrescribiendo | — | Ej. 1 |
| `java.io.FileWriter(nombre, true)` | Abre en modo *append* | Ej. 2 | Ej. 2, 3 |
| `java.io.BufferedWriter` / `write()` / `newLine()` | Escritura con búfer y saltos de línea | — | Ej. 1, 2, 3 |
| *try-with-resources* | Cierra el archivo automáticamente | — | Ej. 1, 2, 3 |
| `Double.parseDouble()` / `Integer.parseInt()` | Convierte texto a número | — | Ej. 2, 3 |
| `for`, `do-while`, `while (true)` + `break` | Control de repetición | — | Ej. 1, 2, 3 |
| `IOException` / `NumberFormatException` | Control de errores | Ej. 1, 2 | Ej. 1, 2, 3 |

[↑ Volver al índice](#índice)

---

<a id="notas-importantes"></a>

## ⚠️ Notas importantes

- **Orden de ejecución (Parte 1).** El Ejercicio 3 borra `estudiantes.txt`; si se ejecuta antes que el 2 mostrará el mensaje de que no se pudo eliminar.
- **Archivo previo en el Ejercicio 2 (Parte 1).** El enunciado indica que `estudiantes.txt` debe existir antes. Al usar `FileWriter` con `true`, Java lo crea si no existe.
- **`estudiantes.txt` compartido.** El Ejercicio 1 de la Parte 2 usa el mismo nombre de archivo que la Parte 1 y lo **sobrescribe** (abre `FileWriter` sin `true`).
- **Modo *append* en la Parte 2.** `productos.txt` y `ventas.txt` acumulan datos entre ejecuciones.
- **Números no válidos.** Si se ingresa texto donde se espera un número, el programa muestra el error y termina; lo registrado antes del error queda guardado.
- **Ubicación de los archivos.** Los `.txt` se crean en la carpeta desde la que se lanza `java`.

[↑ Volver al índice](#índice)

---

<a id="documentación"></a>

## 📄 Documentación

| Parte | Documento | Tipo | Descripción |
|:-:|---|---|---|
| 📘 1 | [`APE 5 primera parte.docx`](docs/APE%205%20primera%20parte.docx) | Enunciado | Enunciado de los tres ejercicios de la Parte 1 |
| 📘 1 | [`Ape 5 resolución.pdf`](docs/Ape%205%20resoluci%C3%B3n.pdf) | Informe | Informe con los datos del estudiante y capturas del código |
| 📗 2 | [`Ejercicios de APE clase 2.pdf`](docs/Ejercicios%20de%20APE%20clase%202.pdf) | Enunciado | «Ejercicios de APE clase 2» (05/11/2026): registro de estudiantes, productos y ventas |
| 📗 2 | [`Ape 5 resolución Parte2.pdf`](docs/Ape%205%20resoluci%C3%B3n%20Parte2.pdf) | Informe | Informe con los datos del estudiante, enlace al repositorio y capturas del código |

📁 Carpeta completa: [`docs/`](docs/)

[↑ Volver al índice](#índice)

---

<a id="integrantes"></a>

## 👥 Integrantes del grupo

**Grupo 6 · Programación Orientada a Objetos en Java** · UTA – FISEI · Ciclo julio 2026 – diciembre 2026

| N.º | 👤 Integrante |
|:-:|---|
| 1 | Peñafiel Leyber |
| 2 | Joel Pacha |
| 3 | Marlon Yaguana |
| 4 | Joseph Castro |
| 5 | Matías Pico |
| 6 | Steeve Ortiz |

[↑ Volver al índice](#índice)

---

<a id="autor"></a>

## ✍️ Autor

<div align="center">

**Leyber Peñafiel** · Carrera de Software, Nivel 1, Curso B · Universidad Técnica de Ambato

👨‍🏫 Docente: Ing. José Caiza · 📅 Entregas: 04/11/2026 (Parte 1) y 05/11/2026 (Parte 2)

🔗 Repositorio: <https://github.com/LeyberP/APE_5_Primera_Parte>

![Hecho con Java](https://img.shields.io/badge/Hecho%20con-Java-orange?style=flat-square&logo=openjdk&logoColor=white)
![UTA FISEI](https://img.shields.io/badge/UTA-FISEI-8B0000?style=flat-square)

</div>
