# MenuJava
Objetivo: Desarrollar una interfaz gráfica de usuario (GUI) en JavaFX que incluya una barra de menú con varias opciones y submenús, permitiendo al usuario realizar diferentes acciones a través de estos menús.

Requisitos:

1. MenuBar: Crear una barra de menú principal.

2. Menus: Añadir menús principales como “Archivo”, “Editar”, y “Ayuda”.

3. MenuItems: Añadir elementos de menú (opciones) dentro de cada menú principal.

4. Separadores: Utilizar separadores (SeparatorMenuItem) para organizar los elementos del menú.

5. Acciones: Definir acciones para cada elemento de menú, como imprimir mensajes en la consola.

6. Layout: Utilizar un BorderPane para organizar la barra de menú en la parte superior de la ventana.





![image](https://github.com/josesamaniego14/MenuJava/assets/169215284/c5ab335e-ac11-4e1d-a8db-af5398982403)

![image](https://github.com/josesamaniego14/MenuJava/assets/169215284/54105a37-7a1c-431d-99a0-8935a835eec0)

![image](https://github.com/josesamaniego14/MenuJava/assets/169215284/347465e9-d4c5-4895-96cb-7ca0639f2ee5)

Este código es una aplicación de JavaFX que crea una interfaz gráfica con una barra de menú y un área central para mostrar mensajes. En el método start, se utiliza un BorderPane como contenedor principal, colocando un Label en el centro para mostrar mensajes. Se crea una barra de menú (MenuBar) con tres menús: "Archivo", "Editar" y "Ayuda".

El menú "Archivo" contiene opciones para crear, abrir, guardar archivos, y salir de la aplicación, cada una con un evento asociado que actualiza el Label con un mensaje correspondiente. El menú "Editar" tiene opciones para copiar y pegar, también con eventos que actualizan el Label. El menú "Ayuda" tiene una opción "Acerca de" que muestra un cuadro de diálogo de información y actualiza el Label.

Finalmente, la barra de menú se añade a la parte superior del BorderPane, se crea una escena con el BorderPane, se aplica una hoja de estilos CSS, y se muestra la ventana principal titulada "Tarea Menú". El método updateMessage se utiliza para actualizar el texto del Label central con mensajes específicos según las acciones del usuario.
