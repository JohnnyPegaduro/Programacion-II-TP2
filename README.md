# TP2 – Programación Estructurada (Java)

[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://adoptium.net/)
![Build](https://img.shields.io/badge/Build-Ant-blue.svg)
![IDE](https://img.shields.io/badge/IDE-NetBeans%2012%2B-1f6feb.svg)
![Status](https://img.shields.io/badge/Estado-Listo%20para%20entrega-success.svg)

Trabajo práctico para **Programación II**. El objetivo es aplicar estructuras **condicionales**, **ciclos**, **funciones**, **arrays** y **recursividad** en Java, con un proyecto simple que podés abrir y ejecutar en NetBeans (Ant) o desde consola.

---

## 📑 Contenidos

- [Objetivos](#-objetivos)
- [Requisitos](#-requisitos)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Ejecución en NetBeans](#-ejecución-en-netbeans)
- [Ejecución por consola](#-ejecución-por-consola)
- [Descripción de ejercicios](#-descripción-de-ejercicios)
  - [Condicionales (1–4)](#condicionales-14)
  - [Repetición (5–7)](#repetición-57)
  - [Funciones (8–11)](#funciones-811)
  - [Arrays y Recursividad (12–13)](#arrays-y-recursividad-1213)
- [Troubleshooting](#-troubleshooting)

---

## 🎯 Objetivos

- Practicar **condicionales** (`if/else`, `switch`).
- Usar **ciclos** (`for`, `while`, `do-while`).
- Modularizar con **métodos** (con y sin retorno).
- Trabajar con **arrays** y **recursividad**.
- Ejecutar y probar cada ejercicio de forma **independiente**.

---

## 🧰 Requisitos

- **JDK 17** (o superior).
- **Apache NetBeans 12+** (o cualquier IDE/terminal con `javac`).
- SO: Windows / Linux / macOS.

> Sugerido para evitar *warnings* de compilación: en `nbproject/project.properties` agregar  
> `javac.release=17` (ver [Troubleshooting](#-troubleshooting)).

---

## 🗂️ Estructura del proyecto

src/
└── tp2/
├── Main.java
├── Ej01Bisiesto.java
├── Ej02MayorDeTres.java
├── Ej03ClasificacionEdad.java
├── Ej04DescuentoCategoria.java
├── Ej05SumaParesWhile.java
├── Ej06ContadorPNC.java
├── Ej07ValidacionNota.java
├── Ej08PrecioFinal.java
├── Ej09CostoEnvioYTotal.java
├── Ej10ActualizarStock.java
├── Ej11DescuentoEspecial.java
├── Ej12ArrayPrecios.java
└── Ej13RecursivoArray.java

yaml
Copiar código

- `Main.java`: menú interactivo para ejecutar cualquiera de los 13 ejercicios con F6.

---

## ▶️ Ejecución en NetBeans

1. **Abrir proyecto:** `File → Open Project…` y seleccionar la carpeta del repo.
2. **Run Project (F6):** ejecuta `tp2.Main` y muestra un **menú 1–13**.
3. **Run File (Shift+F6):** para ejecutar un ejercicio puntual (abrir el `.java` y correr).

> Si NetBeans pregunta por la **Main Class**, elegir: `tp2.Main`.

---

## 💻 Ejecución por consola

Desde la raíz del proyecto:

```bash
# Compilar (JDK 17+):
mkdir -p build/classes
find src -name "*.java" > sources.txt
javac --release 17 -d build/classes @sources.txt

# Ejecutar el menú principal:
java -cp build/classes tp2.Main

# O un ejercicio puntual (ejemplo):
java -cp build/classes tp2.Ej05SumaParesWhile
En Windows (sin find/bash):

bat
Copiar código
mkdir build\classes
dir /b /s src\*.java > sources.txt
javac --release 17 -d build\classes @sources.txt
java -cp build\classes tp2.Main
📘 Descripción de ejercicios
Condicionales (1–4)
Ej01Bisiesto.java
Pide un año y determina si es bisiesto.
Regla: divisible por 4 y no por 100, o divisible por 400.

Ej02MayorDeTres.java
Lee tres enteros y muestra el mayor.

Ej03ClasificacionEdad.java
Clasifica: < 12: Niño · 12–17: Adolescente · 18–59: Adulto · >= 60: Adulto mayor.

Ej04DescuentoCategoria.java
Aplica descuento por categoría y muestra precio final.
A = 10%, B = 15%, C = 20%.

Repetición (5–7)
Ej05SumaParesWhile.java
Suma números pares ingresados hasta que el usuario ingrese 0.

Ej06ContadorPNC.java
Pide 10 enteros y cuenta positivos, negativos y ceros.

Ej07ValidacionNota.java
Pide una nota [0–10] con do-while hasta que sea válida.

Funciones (8–11)
Ej08PrecioFinal.java
calcularPrecioFinal(base, impuesto, descuento)
Fórmula: base + (base * impuesto) - (base * descuento)
(impuesto/descuento ingresados en %, convertidos a decimales).

Ej09CostoEnvioYTotal.java
calcularCostoEnvio(peso, zona) → Nacional: $5/kg, Internacional: $10/kg.
calcularTotalCompra(precioProducto, costoEnvio) → suma ambos.

Ej10ActualizarStock.java
nuevoStock = stockActual - cantidadVendida + cantidadRecibida.

Ej11DescuentoEspecial.java
Usa constante global DESCUENTO_ESPECIAL = 0.10.
Muestra descuento aplicado y precio final.

Arrays y Recursividad (12–13)
Ej12ArrayPrecios.java
Muestra un array de precios, modifica un elemento y vuelve a mostrar.

Ej13RecursivoArray.java
Imprime recursivamente el array antes y después de modificar un elemento.

🛠️ Troubleshooting
Si Ant/NetBeans reporta errores como:

Must set dist.javadoc.dir

Must set build.test.classes.dir

Must set build.classes.excludes

Warning: location of system modules is not set … --release 17 is recommended

Asegurarse de tener en nbproject/project.properties:

properties
Copiar código
# --- Básicos de build ---
build.dir=build
build.classes.dir=${build.dir}/classes
build.generated.dir=${build.dir}/generated
build.generated.sources.dir=${build.dir}/generated-sources
dist.dir=dist
dist.jar=${dist.dir}/TP2_ProgEstructurada_Completo.jar
dist.javadoc.dir=${dist.dir}/javadoc
source.encoding=UTF-8

# --- Compilación (recomendado por JDK 17) ---
javac.release=17
# (Estas pueden quedar, pero release manda)
javac.source=17
javac.target=17

# --- Main Class ---
main.class=tp2.Main

# --- Tests (aunque no se usen) ---
test.src.dir=test
build.test.classes.dir=${build.dir}/test/classes
build.test.results.dir=${build.dir}/test/results
run.test.classpath=${build.test.classes.dir}:${build.classes.dir}
debug.test.classpath=${run.test.classpath}

# --- Requerido por build-impl.xml ---
includes=**
excludes=
build.classes.excludes=**/*.java,**/*.form

# --- Classpath de ejecución ---
javac.classpath=
run.classpath=${build.classes.dir}:${javac.classpath}
Después de editar, hacer Clean and Build y volver a Run Project (F6).


