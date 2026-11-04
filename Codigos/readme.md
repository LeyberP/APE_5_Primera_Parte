# Codigos · Código fuente

[← Volver al README principal](../README.md) · [Ver documentación (`docs/`)](../docs/)

Esta carpeta contiene los **tres programas en Java** de la APE 5 (Primera Parte), dedicados al manejo de ficheros con `java.io`. Cada archivo es una clase independiente con su propio método `main`; no declaran `package`, no dependen entre sí y solo usan la API estándar de Java (`java.io` y `java.util.Scanner`).

## Contenido

| Archivo | Ejercicio | Qué hace | Archivo de texto | Enunciado y requisitos |
|---|:-:|---|---|---|
| [`CrearCurso.java`](CrearCurso.java) | 1 | Crea un archivo vacío e informa si se creó o ya existía | `curso.txt` | [Ver ejercicio 1](../README.md#ejercicio-1-crear-un-fichero-en-java) |
| [`EscribirArchivo.java`](EscribirArchivo.java) | 2 | Lee un mensaje por teclado y lo agrega al final del archivo | `estudiantes.txt` | [Ver ejercicio 2](../README.md#ejercicio-2-escribir-información-en-un-fichero) |
| [`EliminarArchivo.java`](EliminarArchivo.java) | 3 | Elimina el archivo e informa del resultado | `estudiantes.txt` | [Ver ejercicio 3](../README.md#ejercicio-3-eliminar-un-fichero-en-java) |

## Clases y métodos clave por programa

| Programa | Clases utilizadas | Métodos y elementos destacados |
|---|---|---|
| `CrearCurso` | `File`, `IOException` | `createNewFile()`, `getName()`, `if-else`, `try-catch` |
| `EscribirArchivo` | `Scanner`, `FileWriter`, `IOException` | `nextLine()`, `new FileWriter("estudiantes.txt", true)` (modo *append*), `write()`, `close()`, `try-catch` |
| `EliminarArchivo` | `File` | `delete()`, `if-else`, `getName()` |

## Compilar y ejecutar

Ejecuta los comandos **desde esta carpeta**, porque `curso.txt` y `estudiantes.txt` se crean en el directorio de trabajo actual.

```bash
javac *.java
```

| Ejercicio | Comando |
|:-:|---|
| 1 | `java CrearCurso` |
| 2 | `java EscribirArchivo` |
| 3 | `java EliminarArchivo` |

**Orden recomendado: 1 → 2 → 3.** El Ejercicio 2 espera que `estudiantes.txt` exista y el Ejercicio 3 lo elimina, así que entre el 1 y el 2 hay que crearlo:

| Sistema | Comando para crear `estudiantes.txt` |
|---|---|
| Linux / macOS / Git Bash | `touch estudiantes.txt` |
| Windows PowerShell | `New-Item estudiantes.txt -ItemType File` |
| Windows CMD | `type nul > estudiantes.txt` |

> Con Java 11 o superior también se puede ejecutar sin compilar: `java CrearCurso.java`.
> Las instrucciones completas, con ejemplos de salida, están en el [README principal](../README.md#instrucciones-de-ejecución).

## Qué esperar

| Ejercicio | Salida por consola |
|:-:|---|
| 1 | `Archivo creado correctamente: curso.txt` (o `El archivo ya existe: curso.txt` si ya estaba) |
| 2 | `Escribe un mensaje: ` y, tras escribirlo, `La información se guardó correctamente.` |
| 3 | `El archivo estudiantes.txt se eliminó correctamente.` (o `No se pudo eliminar el archivo. Puede que no exista o que esté en uso.`) |

## Notas

- Los archivos `.class` que genera `javac` y los `.txt` creados al ejecutar son resultados de la ejecución, no del código fuente; no es necesario subirlos al repositorio.
- Si las tildes o la ñ se ven mal en la consola, compila con `javac -encoding UTF-8 *.java` y configura la terminal en UTF-8 (en Windows: `chcp 65001`).
