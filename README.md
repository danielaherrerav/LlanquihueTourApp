![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧳 LlanquihueTourApp - Gestión de Tours

## 👤 Autor del proyecto
- **Nombre completo:** DANIELA HERRERA VILLALOBOS
- **Carrera:** ANALISTA PROGRAMADOR COMPUTACIONAL
- **Sede:** ONLINE

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la **Semana 6** de la asignatura *Desarrollo Orientado a Objetos I*. Consiste en una jerarquía de clases que modela los distintos servicios turísticos de **Llanquihue Tour** aplicando **herencia simple** y **composición**.

Se cuenta con una superclase `ServicioTuristico` y tres subclases: `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`. Además, cada servicio turístico está compuesto por un objeto `Guia`, lo que representa la relación de composición entre clases.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src
├── 📁 model
│   ├── Tour.java               # Clase de semanas anteriores
│   ├── Guia.java               # Clase de composición
│   ├── ServicioTuristico.java  # Superclase
│   ├── RutaGastronomica.java   # Subclase
│   ├── PaseoLacustre.java      # Subclase
│   └── ExcursionCultural.java  # Subclase
├── 📁 data
│   ├── GestorDatos.java        # Lee archivo .txt (semana anterior)
│   └── GestorServicios.java    # Crea instancias de prueba
├── 📁 service
│   └── TourService.java        # Filtros (semana anterior)
└── 📁 ui
    └── Main.java               # Ejecuta el programa
```

### Descripción de las clases
### Clases nuevas de esta semana

| Clase | Paquete | Descripción |
|---|---|---|
| `Guia` | `model` | Representa al guía turístico asignado a cada servicio |
| `ServicioTuristico` | `model` | Superclase con atributos comunes a todos los servicios |
| `RutaGastronomica` | `model` | Subclase con el atributo `numeroDeParadas` |
| `PaseoLacustre` | `model` | Subclase con el atributo `tipoEmbarcacion` |
| `ExcursionCultural` | `model` | Subclase con el atributo `lugarHistorico` |
| `GestorServicios` | `data` | Crea las instancias de prueba y las muestra por consola |

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/danielaherrerav/LlanquihueTourApp.git
```

2. Abre el proyecto en **IntelliJ IDEA** (`File > Open` → selecciona la carpeta del proyecto).

3. Ejecuta el archivo `Main.java` desde el paquete `ui`:
   - Clic derecho sobre `Main.java` → **Run 'Main'**

4. Ejemplo de salida esperada en consola:

```
=== RUTAS GASTRONÓMICAS ===
Nombre: Ruta del Salmón | Duración: 3 hrs | Guía: Carlos Muñoz (Español, 5 años exp.) | Paradas: 5
Nombre: Ruta Gastronómica Sur | Duración: 4 hrs | Guía: Ana Pérez (Inglés, 8 años exp.) | Paradas: 8

=== PASEOS LACUSTRES ===
Nombre: Paseo Lago Llanquihue | Duración: 2 hrs | Guía: Ana Pérez (Inglés, 8 años exp.) | Embarcación: Catamarán
Nombre: Paseo Lago Todos Los Santos | Duración: 3 hrs | Guía: Luis Torres (Español, 3 años exp.) | Embarcación: Lancha

=== EXCURSIONES CULTURALES ===
Nombre: Tour Frutillar | Duración: 4 hrs | Guía: Carlos Muñoz (Español, 5 años exp.) | Lugar histórico: Teatro del Lago
Nombre: Tour Puerto Varas | Duración: 5 hrs | Guía: Luis Torres (Español, 3 años exp.) | Lugar histórico: Iglesia del Sagrado Corazón
```

---

**Repositorio GitHub:** danielaherrerav/LlanquihueTourApp.git   
**Fecha de entrega:** [27/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I
