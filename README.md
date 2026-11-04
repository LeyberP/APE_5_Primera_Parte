# APE 5 – Primera Parte

### Manejo de ficheros en Java con `java.io`

![Java](https://img.shields.io/badge/Java-8%2B-orange?logo=openjdk&logoColor=white)
![Ejercicios](https://img.shields.io/badge/ejercicios-3-blue)
![Dependencias](https://img.shields.io/badge/dependencias-ninguna-brightgreen)

**Universidad Técnica de Ambato**

| Campo | Detalle |
|---|---|
| **Estudiante** | Leyber Peñafiel |
| **Docente** | Ing. José Caiza |
| **Carrera** | Software |
| **Nivel / Curso** | 1 / B |
| **Fecha** | 04/11/2026 |
| **Repositorio** | [LeyberP/APE_5_Primera_Parte](https://github.com/LeyberP/APE_5_Primera_Parte) |

---

## Índice

- [Navegación rápida](#navegación-rápida)
- [Descripción general](#descripción-general)
- [Estructura del repositorio](#estructura-del-repositorio)
- [Requisitos previos](#requisitos-previos)
- [Ejercicios](#ejercicios)
  - [Ejercicio 1. Crear un fichero en Java](#ejercicio-1-crear-un-fichero-en-java)
  - [Ejercicio 2. Escribir información en un fichero](#ejercicio-2-escribir-información-en-un-fichero)
  - [Ejercicio 3. Eliminar un fichero en Java](#ejercicio-3-eliminar-un-fichero-en-java)
- [Instrucciones de ejecución](#instrucciones-de-ejecución)
- [Conceptos aplicados](#conceptos-aplicados)
- [Notas importantes](#notas-importantes)
- [Documentación](#documentación)
- [Autor](#autor)

---

## Navegación rápida

| Categoría | Descripción | Enlaces |
|---|---|---|
| Ejercicio 1 | Crear `curso.txt` | [Enunciado y resolución](#ejercicio-1-crear-un-fichero-en-java) · [`CrearCurso.java`](Codigos/CrearCurso.java) |
| Ejercicio 2 | Escribir en `estudiantes.txt` | [Enunciado y resolución](#ejercicio-2-escribir-información-en-un-fichero) · [`EscribirArchivo.java`](Codigos/EscribirArchivo.java) |
| Ejercicio 3 | Eliminar `estudiantes.txt` | [Enunciado y resolución](#ejercicio-3-eliminar-un-fichero-en-java) · [`EliminarArchivo.java`](Codigos/EliminarArchivo.java) |
| Código fuente | Los tres programas Java | [`Codigos/`](Codigos/) |
| Documentación | Enunciado (.docx) e informe de resolución (.pdf) | [`docs/`](docs/) |
| Ejecución | Cómo compilar y correr los programas | [Instrucciones de ejecución](#instrucciones-de-ejecución) |

---

## Descripción general

Este repositorio contiene la **primera parte de la APE 5**: tres programas en Java que practican las operaciones básicas sobre archivos de texto con la API estándar `java.io`: **crear**, **escribir** y **eliminar** un fichero. No se utilizan librerías externas ni gestores de dependencias; basta con tener un JDK instalado.

| N.º | Programa | Qué hace | Archivo que utiliza |
|:-:|---|---|---|
| 1 | [`CrearCurso.java`](Codigos/CrearCurso.java) | Crea un archivo vacío e informa si se creó o ya existía | `curso.txt` |
| 2 | [`EscribirArchivo.java`](Codigos/EscribirArchivo.java) | Lee un mensaje por teclado y lo agrega al final del archivo | `estudiantes.txt` |
| 3 | [`EliminarArchivo.java`](Codigos/EliminarArchivo.java) | Elimina el archivo e informa del resultado | `estudiantes.txt` |

[↑ Volver al índice](#índice)

---

## Estructura del repositorio

```text
APE_5_Primera_Parte/
├── README.md                        # Este documento (descripción principal)
├── Codigos/                         # Código fuente de los ejercicios
│   ├── CrearCurso.java              # Ejercicio 1
│   ├── EscribirArchivo.java         # Ejercicio 2
│   ├── EliminarArchivo.java         # Ejercicio 3
│   └── readme.md
└── docs/                            # Documentos de la actividad
    ├── APE 5 primera parte.docx     # Enunciado de los ejercicios
    ├── Ape 5 resolución.pdf         # Informe con la resolución
    └── readme.md
```

| Ruta | Contenido |
|---|---|
| [`Codigos/`](Codigos/) | Tres clases Java, cada una con su propio `main`, sin paquetes ni dependencias entre sí |
| [`Codigos/CrearCurso.java`](Codigos/CrearCurso.java) | Solución del Ejercicio 1 |
| [`Codigos/EscribirArchivo.java`](Codigos/EscribirArchivo.java) | Solución del Ejercicio 2 |
| [`Codigos/EliminarArchivo.java`](Codigos/EliminarArchivo.java) | Solución del Ejercicio 3 |
| [`docs/`](docs/) | Material de la actividad |
| [`docs/APE 5 primera parte.docx`](docs/APE%205%20primera%20parte.docx) | Enunciado original |
| [`docs/Ape 5 resolución.pdf`](docs/Ape%205%20resoluci%C3%B3n.pdf) | Informe entregado, con las capturas del código |

Cada carpeta incluye su propio `readme.md` con más detalle: [`Codigos/readme.md`](Codigos/readme.md) (compilación y ejecución de cada programa) y [`docs/readme.md`](docs/readme.md) (correspondencia entre documentos, ejercicios y código).

> Los archivos `curso.txt` y `estudiantes.txt` **no forman parte del repositorio**: los generan los programas al ejecutarse, en la carpeta desde la que se lanzan.

[↑ Volver al índice](#índice)

---

## Requisitos previos

| Requisito | Detalle |
|---|---|
| **JDK** | Java 8 o superior (se verificó con OpenJDK 21) |
| **Terminal** | Bash, PowerShell o CMD. También sirve cualquier IDE (IntelliJ IDEA, Eclipse, VS Code, NetBeans) |
| **Git** | Opcional; solo para clonar. También se puede descargar el ZIP desde GitHub |
| **Librerías externas** | Ninguna: solo `java.io` y `java.util.Scanner` |

Comprobar que Java está disponible:

```bash
java -version
javac -version
```

[↑ Volver al índice](#índice)

---

## Ejercicios

### Ejercicio 1. Crear un fichero en Java

**Enunciado**

Desarrollar un programa en Java que permita crear un archivo de texto llamado `curso.txt`.

**Indicaciones (requisitos)**

1. Importar las clases necesarias para trabajar con archivos.
2. Crear un objeto de tipo `File`.
3. Utilizar el método `createNewFile()` para crear el archivo.
4. Comprobar si el archivo se creó correctamente o si ya existe.
5. Mostrar el nombre del archivo utilizando `getName()`.
6. Utilizar `try-catch` para controlar posibles errores.

**Clases y métodos sugeridos:** `File`, `IOException`, `createNewFile()`, `getName()`

**Resolución** · Archivo: [`Codigos/CrearCurso.java`](Codigos/CrearCurso.java)

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

**Descripción de la solución**

Se crea un objeto `File` que apunta a `curso.txt` (ruta relativa a la carpeta desde la que se ejecuta el programa). El método `createNewFile()` devuelve `true` si el archivo no existía y fue creado, y `false` si ya existía; por eso no sobrescribe nada y permite distinguir ambos casos con un `if-else`. En los dos mensajes se muestra el nombre mediante `getName()`. Como `createNewFile()` puede lanzar una `IOException`, toda la lógica está dentro de un bloque `try-catch` que informa del error e imprime la traza.

**Cumplimiento de los requisitos**

| # | Requisito | Dónde se cumple | Estado |
|:-:|---|---|:-:|
| 1 | Importar clases | Líneas 1–2: `File`, `IOException` | ✅ |
| 2 | Objeto `File` | Línea 7 | ✅ |
| 3 | `createNewFile()` | Línea 9 | ✅ |
| 4 | Comprobar creación / existencia | `if-else`, líneas 9–13 | ✅ |
| 5 | Mostrar el nombre con `getName()` | Líneas 10 y 12 | ✅ |
| 6 | `try-catch` | Líneas 6 y 15–18 | ✅ |

**Salida de ejemplo**

```text
# Primera ejecución
Archivo creado correctamente: curso.txt

# Segunda ejecución (el archivo ya existe)
El archivo ya existe: curso.txt
```

[↑ Volver al índice](#índice)

---

### Ejercicio 2. Escribir información en un fichero

**Enunciado**

Desarrollar un programa en Java que permita ingresar un mensaje por teclado y almacenarlo en un archivo de texto existente llamado `estudiantes.txt`.

**Indicaciones (requisitos)**

1. Importar las clases necesarias.
2. Crear un objeto `Scanner` para ingresar información por teclado.
3. Solicitar al usuario que escriba un mensaje.
4. Utilizar `FileWriter` para abrir el archivo `estudiantes.txt`.
5. Utilizar el parámetro `true` para conservar la información anterior y agregar el nuevo mensaje al final.
6. Utilizar el método `write()` para guardar el mensaje.
7. Cerrar el archivo utilizando `close()`.
8. Mostrar un mensaje indicando que la información se guardó correctamente.
9. Controlar posibles errores mediante `try-catch`.

**Clases y métodos sugeridos:** `Scanner`, `FileWriter`, `IOException`, `write()`, `close()`

> **Nota del enunciado:** el archivo `estudiantes.txt` debe existir previamente.

**Resolución** · Archivo: [`Codigos/EscribirArchivo.java`](Codigos/EscribirArchivo.java)

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

**Descripción de la solución**

Un `Scanner` sobre `System.in` lee con `nextLine()` la línea completa que escribe el usuario (admite espacios). Luego se abre `estudiantes.txt` con `new FileWriter("estudiantes.txt", true)`: el segundo argumento `true` activa el **modo *append***, de modo que el contenido anterior se conserva y el mensaje nuevo se agrega al final. Se escribe el mensaje seguido de un salto de línea (`"\n"`) para que cada ejecución deje su propia línea, se cierra el escritor con `close()` (lo que además vuelca los datos al disco) y se confirma por pantalla. Los errores de escritura se capturan con `try-catch` y el `Scanner` se cierra al terminar.

**Cumplimiento de los requisitos**

| # | Requisito | Dónde se cumple | Estado |
|:-:|---|---|:-:|
| 1 | Importar clases | Líneas 1–3: `FileWriter`, `IOException`, `Scanner` | ✅ |
| 2 | Objeto `Scanner` | Línea 7 | ✅ |
| 3 | Solicitar el mensaje | Líneas 10–11 | ✅ |
| 4 | `FileWriter` sobre `estudiantes.txt` | Línea 13 | ✅ |
| 5 | Parámetro `true` (conservar y agregar al final) | Línea 13 | ✅ |
| 6 | `write()` | Línea 15 | ✅ |
| 7 | `close()` | Línea 17 (y `teclado.close()` en la 26) | ✅ |
| 8 | Mensaje de confirmación | Línea 19 | ✅ |
| 9 | `try-catch` | Líneas 9 y 21–24 | ✅ |

**Salida de ejemplo** (con `estudiantes.txt` ya creado)

```text
# Primera ejecución
Escribe un mensaje: Mensaje de prueba A
La información se guardó correctamente.

# Segunda ejecución
Escribe un mensaje: Mensaje de prueba B
La información se guardó correctamente.
```

Contenido de `estudiantes.txt` después de ambas ejecuciones (el contenido anterior se conserva):

```text
Mensaje de prueba A
Mensaje de prueba B
```

[↑ Volver al índice](#índice)

---

### Ejercicio 3. Eliminar un fichero en Java

**Enunciado**

Desarrollar un programa en Java que permita eliminar el archivo de texto `estudiantes.txt`.

**Indicaciones (requisitos)**

1. Importar la clase necesaria para trabajar con archivos.
2. Crear un objeto de tipo `File` indicando el nombre del archivo que se desea eliminar.
3. Utilizar el método `delete()` para intentar eliminar el archivo.
4. Comprobar si la eliminación se realizó correctamente.
5. Si el archivo se eliminó, mostrar un mensaje de confirmación.
6. Si no se pudo eliminar, mostrar un mensaje indicando el problema.

**Clases y métodos sugeridos:** `File`, `delete()`, `if-else`, `System.out.println()`

**Resolución** · Archivo: [`Codigos/EliminarArchivo.java`](Codigos/EliminarArchivo.java)

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

**Descripción de la solución**

Se crea un `File` que representa a `estudiantes.txt` y se invoca `delete()`, que devuelve `true` si el archivo fue eliminado y `false` en caso contrario (no existe, está en uso o no hay permisos). Ese valor booleano se evalúa directamente en un `if-else`: si es `true` se muestra la confirmación con el nombre del archivo y, si es `false`, un mensaje que indica las causas probables. `delete()` no lanza `IOException`, por lo que aquí no hace falta un bloque `try-catch`.

**Cumplimiento de los requisitos**

| # | Requisito | Dónde se cumple | Estado |
|:-:|---|---|:-:|
| 1 | Importar `File` | Línea 1 | ✅ |
| 2 | Objeto `File` con el nombre del archivo | Línea 5 | ✅ |
| 3 | `delete()` | Línea 7 | ✅ |
| 4 | Comprobar si se eliminó | Condición del `if`, línea 7 | ✅ |
| 5 | Mensaje de confirmación | Línea 8 | ✅ |
| 6 | Mensaje si no se pudo eliminar | Línea 10 | ✅ |

**Salida de ejemplo**

```text
# Primera ejecución (el archivo existe)
El archivo estudiantes.txt se eliminó correctamente.

# Segunda ejecución (el archivo ya no existe)
No se pudo eliminar el archivo. Puede que no exista o que esté en uso.
```

[↑ Volver al índice](#índice)

---

## Instrucciones de ejecución

Los tres programas están en la carpeta [`Codigos/`](Codigos/) y se ejecutan **desde esa carpeta**, porque los archivos `curso.txt` y `estudiantes.txt` se crean en el directorio de trabajo actual.

### 1. Obtener el proyecto

```bash
git clone https://github.com/LeyberP/APE_5_Primera_Parte.git
cd APE_5_Primera_Parte/Codigos
```

(En Windows, la segunda línea es `cd APE_5_Primera_Parte\Codigos`.) Sin Git, descarga el ZIP desde GitHub con **Code → Download ZIP**, descomprímelo y abre una terminal dentro de `Codigos/`.

### 2. Compilar

```bash
javac *.java
```

Se generan `CrearCurso.class`, `EscribirArchivo.class` y `EliminarArchivo.class`.

### 3. Ejecutar en orden

El orden recomendado es **1 → 2 → 3**, porque el Ejercicio 3 elimina el archivo que usa el Ejercicio 2.

**Linux / macOS / Git Bash**

```bash
java CrearCurso          # Ejercicio 1: crea curso.txt
touch estudiantes.txt    # Preparación: el Ejercicio 2 espera que el archivo exista
java EscribirArchivo     # Ejercicio 2: escribe un mensaje en estudiantes.txt
cat estudiantes.txt      # (opcional) ver el contenido guardado
java EliminarArchivo     # Ejercicio 3: elimina estudiantes.txt
```

**Windows (PowerShell)**

```powershell
java CrearCurso                              # Ejercicio 1: crea curso.txt
New-Item estudiantes.txt -ItemType File      # Preparación: crear estudiantes.txt
java EscribirArchivo                         # Ejercicio 2
Get-Content estudiantes.txt                  # (opcional) ver el contenido
java EliminarArchivo                         # Ejercicio 3
```

**Windows (CMD):** para la preparación usa `type nul > estudiantes.txt` y para ver el contenido, `type estudiantes.txt`.

### Resumen por ejercicio

| Ejercicio | Compilar | Ejecutar | Efecto |
|:-:|---|---|---|
| 1 | `javac CrearCurso.java` | `java CrearCurso` | Crea `curso.txt` (o avisa de que ya existe) |
| 2 | `javac EscribirArchivo.java` | `java EscribirArchivo` | Pide un mensaje y lo agrega a `estudiantes.txt` |
| 3 | `javac EliminarArchivo.java` | `java EliminarArchivo` | Elimina `estudiantes.txt` |

### Alternativas

- **Sin compilar (Java 11 o superior):** cada archivo se puede lanzar directamente, por ejemplo `java CrearCurso.java`.
- **Desde un IDE:** abre la carpeta `Codigos/` como proyecto, selecciona la clase y ejecuta su método `main`. Los archivos `.txt` se crearán en la carpeta de trabajo que defina el IDE (normalmente la raíz del proyecto).
- **Tildes o ñ mal mostradas** (por ejemplo `?` o `Ã³`): compila con `javac -encoding UTF-8 *.java`, pon la consola en UTF-8 (en Windows: `chcp 65001`) y, si hace falta, ejecuta con `java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 NombreClase`.
- **Limpiar archivos generados:** los `.class` se pueden borrar sin problema; conviene no subirlos al repositorio.

[↑ Volver al índice](#índice)

---

## Conceptos aplicados

| Clase / método | Para qué se usa | Ejercicio |
|---|---|:-:|
| `java.io.File` | Representa la ruta de un archivo en el sistema | 1, 3 |
| `File.createNewFile()` | Crea un archivo vacío; devuelve `false` si ya existía | 1 |
| `File.getName()` | Obtiene el nombre del archivo para mostrarlo | 1, 3 |
| `File.delete()` | Elimina el archivo; devuelve `true` o `false` | 3 |
| `java.util.Scanner` / `nextLine()` | Lee una línea completa desde el teclado | 2 |
| `java.io.FileWriter(nombre, true)` | Abre el archivo en modo *append* (conserva el contenido) | 2 |
| `FileWriter.write()` / `close()` | Escribe el texto y libera el archivo | 2 |
| `IOException` y `try-catch` | Controlan los errores de entrada/salida | 1, 2 |
| `if-else` | Decide el mensaje según el resultado de la operación | 1, 3 |

[↑ Volver al índice](#índice)

---

## Notas importantes

- **Orden de ejecución.** El Ejercicio 3 borra `estudiantes.txt`; si se ejecuta antes que el 2, o dos veces seguidas, mostrará el mensaje de que no se pudo eliminar. Es el comportamiento esperado.
- **Archivo previo en el Ejercicio 2.** El enunciado indica que `estudiantes.txt` debe existir antes de ejecutar el programa. El código no lo comprueba: al usar `FileWriter` con `true`, Java **crea el archivo si no existe** y escribe en él. Para respetar el enunciado, créalo antes (ver [Instrucciones de ejecución](#instrucciones-de-ejecución)).
- **Ubicación de los archivos.** Las rutas `curso.txt` y `estudiantes.txt` son relativas: se crean en la carpeta desde la que se lanza `java`, no necesariamente junto al `.java`.
- **Sin paquetes.** Las clases no declaran `package`, por lo que se compilan y ejecutan desde la misma carpeta.

[↑ Volver al índice](#índice)

---

## Documentación

| Documento | Descripción |
|---|---|
| [`APE 5 primera parte.docx`](docs/APE%205%20primera%20parte.docx) | Enunciado de los tres ejercicios, con indicaciones y clases sugeridas |
| [`Ape 5 resolución.pdf`](docs/Ape%205%20resoluci%C3%B3n.pdf) | Informe con los datos del estudiante y las capturas del código de cada ejercicio |

Carpeta completa: [`docs/`](docs/)

[↑ Volver al índice](#índice)

---

## Autor

**Leyber Peñafiel** · Carrera de Software, Nivel 1, Curso B · Universidad Técnica de Ambato
Docente: Ing. José Caiza · Fecha de entrega: 04/11/2026

Repositorio: <https://github.com/LeyberP/APE_5_Primera_Parte>
