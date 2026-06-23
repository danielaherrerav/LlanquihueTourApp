![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧳 LlanquihueTourApp - Gestión de Tours

## 👤 Autor del proyecto
- **Nombre completo:** DANIELA HERRERA VILLALOBOS
- **Carrera:** ANALISTA PROGRAMADOR COMPUTACIONAL
- **Sede:** ONLINE

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Semana 5 de la asignatura Desarrollo Orientado a Objetos I. Consiste en un sistema en Java que lee tours desde un archivo .txt, los almacena en un ArrayList y permite al usuario buscar y filtrar por tipo, precio y nombre desde consola.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 LlanquihueTourApp
├── 📁 src
│   ├── 📁 model
│   │   └── Tour.java          # Clase que representa un tour
│   ├── 📁 data
│   │   └── GestorDatos.java   # Lee el archivo .txt y crea los objetos
│   ├── 📁 ui
│   │   └── Main.java          # Ejecuta el sistema con Scanner
│   └── 📁 service
│       └── TourService.java   # Filtra y busca tours en la colección
└── 📁 resources
    └── tours.txt              # Archivo con los datos de los tours
```

### Descripción de las clases

| Clase         | Paquete   | Descripción                                                          |
|---------------|-----------|----------------------------------------------------------------------|
| `Tour`        | `model`   | Clase con atributos: nombre, tipo, precio y duración                 |
| `GestorDatos` | `data`    | Lee el archivo `.txt` línea por línea y retorna un `ArrayList<Tour>` |
| `Main`        | `ui`      | Muestra todos los tours y ejecuta el programa                        |
| `TourService` | `service` | Filtra y busca tours en la colección                                 |
---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/danielaherrerav/LlanquihueTourApp.git
```

2. Abre el proyecto en **IntelliJ IDEA** (`File > Open` → selecciona la carpeta del proyecto).

3. Verifica que el archivo `resources/tours.txt` esté en la raíz del proyecto.

4. Ejecuta el archivo `Main.java` desde el paquete `ui`:
   - Clic derecho sobre `Main.java` → **Run 'Main'**

5. Ejemplo de salida esperada en consola:

```
=== TODOS LOS TOURS ===
Tour: Ruta Gastronómica | Tipo: gastronómico | Precio: $45000 | Duración: 3 hrs
Tour: Paseo Lacustre Llanquihue | Tipo: lacustre | Precio: $35000 | Duración: 2 hrs
Tour: Excursión Volcán Osorno | Tipo: aventura | Precio: $60000 | Duración: 8 hrs
Tour: Tour Cultural Frutillar | Tipo: cultural | Precio: $25000 | Duración: 4 hrs
Tour: Ruta del Salmón | Tipo: gastronómico | Precio: $40000 | Duración: 3 hrs
Tour: Kayak en Lago | Tipo: aventura | Precio: $30000 | Duración: 5 hrs

=== TOURS GASTRONÓMICOS ===
Tour: Ruta Gastronómica | Tipo: gastronómico | Precio: $45000 | Duración: 3 hrs
Tour: Ruta del Salmón | Tipo: gastronómico | Precio: $40000 | Duración: 3 hrs

=== TOURS CON PRECIO MENOR A $40.000 ===
Tour: Paseo Lacustre Llanquihue | Tipo: lacustre | Precio: $35000 | Duración: 2 hrs
Tour: Tour Cultural Frutillar | Tipo: cultural | Precio: $25000 | Duración: 4 hrs
Tour: Kayak en Lago | Tipo: aventura | Precio: $30000 | Duración: 5 hrs
```

---

**Repositorio GitHub:** danielaherrerav/LlanquihueTourApp.git   
**Fecha de entrega:** [22/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I
