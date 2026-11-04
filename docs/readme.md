# docs · Documentación de la actividad

[← Volver al README principal](../README.md) · [Ver código fuente (`Codigos/`)](../Codigos/)

Esta carpeta reúne los documentos de la **APE 5 (Primera Parte)**: el enunciado con los ejercicios solicitados y el informe con la resolución entregada.

## Documentos

| Documento | Tipo | Descripción |
|---|---|---|
| [`APE 5 primera parte.docx`](APE%205%20primera%20parte.docx) | Enunciado | Documento «Ejercicios APE» con los tres ejercicios: enunciado, indicaciones paso a paso y clases y métodos sugeridos |
| [`Ape 5 resolución.pdf`](Ape%205%20resoluci%C3%B3n.pdf) | Informe de resolución | Informe de 2 páginas con los datos del estudiante y las capturas del código de cada ejercicio |

## Correspondencia entre documentos y código

| Ejercicio | Tema | Enunciado (`.docx`) | Informe (`.pdf`) | Código fuente | Descripción en el README |
|:-:|---|:-:|:-:|---|---|
| 1 | Crear un fichero (`curso.txt`) | Ejercicio 1 | Página 1 | [`CrearCurso.java`](../Codigos/CrearCurso.java) | [Ver](../README.md#ejercicio-1-crear-un-fichero-en-java) |
| 2 | Escribir en un fichero (`estudiantes.txt`) | Ejercicio 2 | Página 1 | [`EscribirArchivo.java`](../Codigos/EscribirArchivo.java) | [Ver](../README.md#ejercicio-2-escribir-información-en-un-fichero) |
| 3 | Eliminar un fichero (`estudiantes.txt`) | Ejercicio 3 | Página 2 | [`EliminarArchivo.java`](../Codigos/EliminarArchivo.java) | [Ver](../README.md#ejercicio-3-eliminar-un-fichero-en-java) |

## Resumen del enunciado

1. **Crear un fichero en Java:** programa que crea `curso.txt` con `File` y `createNewFile()`, comprueba si se creó o ya existía y muestra el nombre con `getName()`, controlando errores con `try-catch`.
2. **Escribir información en un fichero:** programa que lee un mensaje con `Scanner` y lo agrega al final de `estudiantes.txt` usando `FileWriter` en modo *append* (`true`), `write()` y `close()`. El enunciado indica que el archivo debe existir previamente.
3. **Eliminar un fichero en Java:** programa que elimina `estudiantes.txt` con `delete()` y muestra un mensaje de confirmación o de error según el resultado.

El detalle completo de requisitos, el código y su explicación están en el [README principal](../README.md#ejercicios).

## Cómo abrir los documentos

- **`.pdf`:** GitHub lo muestra directamente en el navegador al hacer clic sobre el archivo.
- **`.docx`:** GitHub no lo previsualiza; usa el botón de descarga y ábrelo con Word, LibreOffice o Google Docs.
