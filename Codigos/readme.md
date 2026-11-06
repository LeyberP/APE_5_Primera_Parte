# 💻 Codigos · Código fuente

[← Volver al README principal](../README.md) · [Ver documentación (`docs/`)](../docs/)

Esta carpeta contiene los **diez programas en Java** de la APE 5, organizados en una subcarpeta por parte. Todos tratan el manejo de ficheros con `java.io`, cada clase tiene su propio método `main` y solo usan la API estándar de Java (`java.io` y `java.util.Scanner`).

```text
Codigos/
├── Parte 1/   → CrearCurso, EscribirArchivo, EliminarArchivo   (sin package)
├── Parte 2/   → Ejercicio1, Ejercicio2, Ejercicio3              (sin package)
└── Parte3/    → Ejercicio1, Ejercicio2, Ejercicio3, Ejercicio4  (package Parte3)
```

## 📘 Parte 1 – Operaciones básicas con ficheros

| Archivo | Ejercicio | Qué hace | Archivo de texto | Detalle |
|---|:-:|---|---|---|
| [`CrearCurso.java`](Parte%201/CrearCurso.java) | 1 | Crea un archivo vacío e informa si se creó o ya existía | `curso.txt` | [Ver](../README.md#ejercicio-1-crear-un-fichero-en-java) |
| [`EscribirArchivo.java`](Parte%201/EscribirArchivo.java) | 2 | Lee un mensaje por teclado y lo agrega al final del archivo | `estudiantes.txt` | [Ver](../README.md#ejercicio-2-escribir-información-en-un-fichero) |
| [`EliminarArchivo.java`](Parte%201/EliminarArchivo.java) | 3 | Elimina el archivo e informa del resultado | `estudiantes.txt` | [Ver](../README.md#ejercicio-3-eliminar-un-fichero-en-java) |

## 📗 Parte 2 – Registro de datos con `BufferedWriter`

| Archivo | Ejercicio | Qué hace | Archivo de texto | Detalle |
|---|:-:|---|---|---|
| [`Ejercicio1.java`](Parte%202/Ejercicio1.java) | 1 | Registra nombre y calificación de 3 estudiantes | `estudiantes.txt` | [Ver](../README.md#p2-ejercicio-1) |
| [`Ejercicio2.java`](Parte%202/Ejercicio2.java) | 2 | Registra productos y su valor total (modo *append*) | `productos.txt` | [Ver](../README.md#p2-ejercicio-2) |
| [`Ejercicio3.java`](Parte%202/Ejercicio3.java) | 3 | Registra ventas con descuento hasta escribir `fin` | `ventas.txt` | [Ver](../README.md#p2-ejercicio-3) |

## 📙 Parte 3 – Manejo de archivos y flujos de datos

| Archivo | Ejercicio | Qué hace | Archivo de texto | Detalle |
|---|:-:|---|---|---|
| [`Ejercicio1.java`](Parte3/Ejercicio1.java) | 1 | `exists()`, `createNewFile()`, `getName()` y `getPath()` | `datos/prueba.txt` | [Ver](../README.md#p3-ejercicio-1) |
| [`Ejercicio2.java`](Parte3/Ejercicio2.java) | 2 | Escribe 5 asignaturas, una por línea | `materias.txt` | [Ver](../README.md#p3-ejercicio-2) |
| [`Ejercicio3.java`](Parte3/Ejercicio3.java) | 3 | Añade 2 asignaturas en modo *append* | `materias.txt` | [Ver](../README.md#p3-ejercicio-3) |
| [`Ejercicio4.java`](Parte3/Ejercicio4.java) | 4 | Crea el archivo y lo borra si `confirmarBorrado` es `true` | `datos/temporal.txt` | [Ver](../README.md#p3-ejercicio-4) |

## ▶️ Compilar y ejecutar

**Parte 1 y Parte 2** (sin `package`): entra a la subcarpeta y ejecuta ahí.

```bash
cd "Parte 1"   # o: cd "Parte 2"
javac *.java
java CrearCurso        # Parte 2: java Ejercicio1, java Ejercicio2, java Ejercicio3
```

En la Parte 1, el orden recomendado es **1 → 2 → 3** y hay que crear `estudiantes.txt` antes del Ejercicio 2 (`touch estudiantes.txt` · PowerShell: `New-Item estudiantes.txt -ItemType File` · CMD: `type nul > estudiantes.txt`).

**Parte 3** (`package Parte3`): ejecuta **desde esta carpeta (`Codigos/`)** con el nombre completo de la clase.

```bash
javac Parte3/*.java
java Parte3.Ejercicio1
java Parte3.Ejercicio2
java Parte3.Ejercicio3   # después del Ejercicio 2
java Parte3.Ejercicio4
```

> Las instrucciones completas y las salidas de ejemplo están en el [README principal](../README.md#instrucciones-de-ejecución).

## 📝 Notas

- Los `.class` que genera `javac`, los `.txt` y la carpeta `datos/` creados al ejecutar son resultados de la ejecución; no es necesario subirlos al repositorio.
- Si las tildes o la ñ se ven mal en la consola, compila con `javac -encoding UTF-8` y configura la terminal en UTF-8 (en Windows: `chcp 65001`).
