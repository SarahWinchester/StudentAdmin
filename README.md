
 
#### Crear clase Alumno con los siguientes atributos:
[x]

· nombre

- id (numero de 5 dígitos q debe empezar con el numero 5) -> `validar` [x] q el id q asignemos empiece con 5 en el setter sino recibimos un id q empiece con el numero 5 así como q sea de 5 dígitos, hay q poner por `default cero`.

- grado(1ro,2do,3ro,4to,5to,6to) `Validar`[x] que para preescolar y secundaria solo se puedan 3, y primaria 6

- materias - usando un listado de tipo materia, algo así: **List < Materia > materias= new ArrayList<materia>()**;

- nivel (Kinder, Primaria o Secundaria) -> `validar` [x] q solo se pueda uno de los tipos permitidos en el setter, sino poner por `default la palabra “nivel”`
 
#####Clase Materia
[x]
- nombreMateria

- calificacion -> `default será -1`
 
####Clase Empleado con los siguientes atributos:
[x]

- nombre

- id (numero de 5 dígitos q empieza con 1) -> `validar` q el id q asignemos empiece con 1 en el setter sino recibimos un id q empiece con el número 1 así como q sea de 5 dígitos, hay q poner por `default cero.`

- puesto (Maestro, Director, Administrativo) ->` validar` q solo se pueda uno de los tipos permitidos en el setter, sino poner por` default la palabra “puesto”`

- grupo (grupo en el cual está asignado el cual será un string por ejemplo 3roPrimaria), **`nota:`** para hacer las pruebas este string sería la combinación del campo grado y nivel entonces tenemos q poner una cadena valida como 4toPrimaria o 3roSecundaria

 
####Una clase q contenga las operaciones del alumno llamada AdministracionAlumnos,
 
 _con los siguientes métodos o elementos_
 
- Tendremos una variable de instancia con todos los alumnos así List <Alumno> alumnos= new ArrayList<Alumno>();

- [x] **altaAlumno** -> recibe los datos básicos sin materias es decir algo como esto (String nombre, int id, String grado, String nivel) - `validar` q el id no sea repetido con algún otro alumno que ya exista en la lista de alumnos, asi mismo hay q `validar` q las condiciones de los setters se cumplan, una **_sugerencia_** podría ser crear una instancia llenarla con los datos q recibe el método y verificar q cuando llamemos los gets estos sean los correctos o los q recibimos, entonces sino cumple con alguna de estas condiciones imprimir mensaje "Alumno no pudo ser dado de alta favor de verificar datos", y por ende NO agregamos a la lista al alumno, el metodo devuelve un booleano dependiendo del éxito o fracaso de la operación, si pudimos agregar, imprimir mensaje "Alumno dado de alta exitosamente"

- [x] **altaAlumno** (recibe todos los datos incluyendo materias como una lista de materias algo asi (String nombre, int id, String grado, String nivel, List < Materia > materias)) - _utilizar el método previo para no repetir código,_ dependiendo del éxito o fracaso de llamada al otro método altaAlumno continua agregando las materias o no

- [x] **calificarMateria** -> checar si no existe el id imprimir mensaje “ID no existente, favor de verificar”, _recibe el id del alumno y el objeto de tipo materia con la materia a calificar_,ya q por default cuando damos de alta una materia puede o no llevar calificación, también` validar` q la materia q estamos enviando la tenga ya dada de alta el alumno.

- [x] **promoverDeNivel** -> recibe el id del alumno, cambiar de nivel escolar pero checando q este en el último grado del nivel para poder pasarlo al q sigue, por ejemplo si esta en Primaria q este en 6to o en Kinder en 3ro, para el caso de Secundaria si esta en 3ro lo q vamos a hacer es poner la palabra “Graduado” en el campo nivel, manejar mensajes de validación correspondientes si fue o no promovido del nivel correspondiente, _nota: hay q modifcar el setter del campo nivel para q pueda aceptar la cadena “Graduado” como válida._

- [x] **imprimirAlumnos** -> imprimir toda la lista completa de alumnos.

- [x] **reporteAlumnosPorGrupo** -> imprimir en pantalla los alumnos de cierto grado y nivel, manejar mensajes de `validación correspondientes`, todos los datos incluyendo las materias

- [x] **reporteDatosAlumno** -> imprimir todos los datos de cierto alumno incluyendo las materias y sus calificaciones, con cierto id q reciba, `manejar mensajes de validación correspondientes`

###_A manera de tips o de guía para uds, yo hice dos matodos utilitarios q me ayudaron a q el código en los demás métodos no se repitiera y fuera más fácil:_

- [x] **fillMaterias->** toma toda la lista de alumnos y les agrega 3 materias q yo defina, para no tener q dar de alta manualmente las materias a cada alumno, pueden hacerlo q lo haga a todos o a un id q uds le manden, depende de cómo se les haga más fácil.

- [x] **getIndexAlumnoFromList**-> método q devuelve el int del lugar donde se encuentra cierto alumno en la lista de alumnos para su uso en otros métodos, `regresa un -1 `en caso de q no lo encuentre.


#### Clase q contenga las operaciones de los AdministracionEmpleados, con los siguientes métodos o elementos


- tendremos una variable de instancia con todo el personal así List <Empleado> empleados= new ArrayList<Empleado>();

-[x] **altaEmpleado -**> Recibe todos los datos y` validar `q sea correcta la creación son el setters  y q el id no sea repetido como en el caso de los alumnos,` si el empleado a agregar no es maestro el campo grupo tiene q ser NA.`

-[x] **asignarPuesto** -> Recibe el id del empleado y el nuevo puesto a asignar, `validar` si cambia de maestro a otro tipo q desasignemos el grupo y si es a director q no tengamos uno ya existente en la lista de empleados, también` validar `q el puesto q estamos recibiendo sea un string valido, así como el q id del empleado exista en la lista.

-[x] **asignarGrupo** -> Recibe el id del empleado y el grupo a asignar, `validar` q sea maestro para poder asignar, así como el q id del empleado exista en la lista.

-[x] **desasignarGrupo** -> Recibe el id del empleado,` validar` q sea maestro para poder desasignar, así como el q id del empleado exista en la lista.

-[x] **bajaEmpleado** -> Recibe el id del empleado, `validar` q si es maestro no tenga grupo asignado, así como el q id del empleado exista en la lista.

-[x] **reporteEmpleados** -> imprimir todos los empleados y sus datos correspondientes

-[x] **reporteEmpleadosPuesto** -> imprimir todos los empleados de un puesto dado y sus datos correspondientes

-[x] **reporteMaestrosNivel** -> imprimir todos los maestros de cierto nivel dado datos correspondientes

#####Así como en la clase de alumnos también tenemos una utilidad

- [x] **getIndexEmpleadoFromList**-> método q devuelve el int del lugar donde se encuentra cierto empleado en la lista de empleados para su uso en otros métodos, `regresa un -1 en caso de q no lo encuentre`.

- [x] fillMaterias-> toma toda la lista de alumnos y les agrega 3 materias q yo defina, para no tener q dar de alta manualmente las materias a cada alumno, pueden hacerlo q lo haga a todos o a un id q uds le manden, depende de cómo se les haga más fácil.

####En el main de la clase AdministracionAlumnos

- [x] dar de alta 8 alumnos con sus datos completos para poder probar la aplicación, por lo menos 3 materias por alumno y de 3 grupos diferentes uno de cada nivel

- [x] tratar de repetir un par de ids para ver el caso de no éxito, uno por cada método de altaAlumno

- [x] Calificar las materias de los alumnos dados de alta

- [ ] Promover un par de ellos

- [ ] Intentar promover un par y recibir mensaje de "No se puede promover, alumno debe de estar en el último grado del nivel"

- [x] correr el reporte de los alumnos de dos grupos

- [ ] correr el reporte de los datos de 3 alumnos


####En el main de la clase AdministracionEmpleados


-[ ] dar de alta 8 empleados con sus datos completos para poder probar la aplicación dos maestros por nivel, el director y un administrativo

-[ ] asignar el grupo a los maestros

-[ ] cambiar el puesto de un maestro a administrativo

-[ ] cambiar el puesto de un maestro a director, con o sin uno previo

-[ ] dar de baja a dos empleados

-[ ] correr los 3 reportes



Notas: - **todas** las variables de instancia van encapsuladas
                - no importa si utilizamos ciclos sencillos o enhanced (con clases) pero es necesario utilizar por lo menos dos del segundo tipo y si todos con enhanced tendrá un plus para calificar el ejercicio
 -[x] Foreach 1
 -[ ] Foreach 2