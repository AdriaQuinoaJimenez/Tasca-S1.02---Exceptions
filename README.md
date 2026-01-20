# S1.02 - Exceptions

**Descripció**:  
Aquest projecte té com a objectiu aprendre a dotar de robustesa les aplicacions Java mitjançant la gestió correcta d'errors. S'implementen mecanismes per capturar i gestionar excepcions estàndard (com `InputMismatchException` o `IndexOutOfBoundsException`) i es creen excepcions personalitzades per controlar errors específics de la lògica de negoci i validació de dades d'entrada.

## 📌 Enunciat de l'exercici

El projecte es divideix en dos nivells:

* **Nivell 1 - Vendes i Excepcions Personalitzades:** Simulació d'un sistema de vendes on es gestiona l'error d'intentar calcular el total d'una venda buida mitjançant una excepció pròpia (`EmptySaleException`) i es gestionen errors d'accés a arrays (`IndexOutOfBoundsException`).
* **Nivell 2 - Lectura Segura de Dades:** Creació d'una classe utilitària (`ConsoleReader`) que encapsula la complexitat de la classe `Scanner` per garantir que l'usuari introdueix el tipus de dada correcte, evitant que el programa es tanqui per errors de format.

## ✨ Funcionalitats

### Nivell 1: Gestió de Vendes (`Sale`)
- **Càlcul de total protegit:** El mètode `calculateTotal()` verifica si la llista de productes és buida. Si ho és, llança una excepció verificada (`EmptySaleException`).
- **Gestió d'índexs:** El programa principal captura i gestiona l'intent d'accedir a posicions inexistents de la llista de productes.
- **Flux de prova:** El `Main` demostra la captura de l'excepció personalitzada abans d'omplir la llista i la captura de l'error d'índex després.

### Nivell 2: Utilitat de Lectura (`ConsoleReader`)
- **Lectura robusta de tipus primitius:** Mètodes estàtics (`readByte`, `readInt`, `readFloat`, `readDouble`) que capturen `InputMismatchException` i demanen la dada fins que sigui vàlida.
- **Neteja de buffer:** Gestió automàtica del `Scanner` per evitar bucles infinits quan s'introdueixen dades errònies.
- **Validacions personalitzades:**
    - `readChar`: Llança excepció si s'introdueix més d'un caràcter.
    - `readString`: Evita cadenes d'un sol caràcter (segons lògica implementada).
    - `readYesNo`: Valida estrictament les entrades "s" o "n" (ignorant majúscules/minúscules).

## 🛠 Tecnologies
- **Llenguatge:** Java SE (Standard Edition)
- **Entorn de Desenvolupament:** IntelliJ IDEA (Recomanat)
- **Control de Versions:** Git

## 🚀 Instal·lació i Execució

### 1. Clonar el repositori
```bash
git clone [URL_DEL_TEU_REPOSITORI]