/* Consultar universidad iniciales */
SELECT apellido1, apellido2, nombre FROM persona where tipo = "alumno" order by apellido1 asc, apellido2 asc, nombre asc;
SELECT apellido1, apellido2, nombre FROM persona where tipo = "alumno" and isnull(telefono);
SELECT apellido1, apellido2, nombre FROM persona where tipo = "alumno" and year(fecha_nacimiento) = 1999;
select nombre, apellido1, apellido2 from persona where tipo = "profesor" and isnull(telefono) and nif like "%K";
select nombre from asignatura where cuatrimestre = 1 and curso = 3 and id_grado = 7;
select persona.apellido1, persona.apellido2, persona.nombre, departamento.nombre from profesor inner join persona on profesor.id_profesor = persona.id inner join departamento on profesor.id_departamento = departamento.id;
select asignatura.nombre as "Asignatura", curso_escolar.anyo_inicio as "Año inicio", curso_escolar.anyo_fin as "Año fin" from alumno_se_matricula_asignatura inner join asignatura on alumno_se_matricula_asignatura.id_asignatura = asignatura.id inner join curso_escolar on asignatura.curso = curso_escolar.id where alumno_se_matricula_asignatura.id_alumno in (select persona.id from persona where persona.nif = "26902806M");
select departamento.nombre from asignatura inner join profesor on asignatura.id_profesor = profesor.id_profesor inner join departamento on departamento.id = profesor.id_departamento where asignatura.id_grado in (select grado.id from grado where grado.nombre = "Grado en Ingeniería Informática (Plan 2015)") group by departamento.id;
select persona.nombre, persona.apellido1, persona.apellido2 from persona inner join alumno_se_matricula_asignatura on persona.id = alumno_se_matricula_asignatura.id_alumno where persona.tipo = "alumno" and alumno_se_matricula_asignatura.id_curso_escolar in (select curso_escolar.id from curso_escolar where anyo_inicio = 2018 and anyo_fin = 2019) group by persona.id;

/* Consultas con left/right join */
select departamento.nombre, persona.apellido1, persona.apellido2, persona.nombre from (persona left join profesor on persona.id = profesor.id_profesor) left join departamento on profesor.id_departamento = departamento.id where persona.tipo = "profesor" order by departamento.nombre asc, persona.apellido1 asc, persona.apellido2 asc, persona.nombre asc;
select persona.apellido1, persona.apellido2, persona.nombre from persona left join profesor on persona.id = profesor.id_profesor where persona.tipo = "profesor" and isnull(profesor.id_departamento);
select departamento.nombre from departamento left join profesor on departamento.id = profesor.id_departamento where isnull(profesor.id_profesor);
select persona.apellido1, persona.apellido2, persona.nombre from persona left join asignatura on persona.id = asignatura.id_profesor where isnull(asignatura.id_profesor);
select asignatura.nombre from asignatura where isnull(asignatura.id_profesor);
/* Retorna un llistat amb tots els departaments que no han impartit assignatures en cap curs escolar. --> No encuentro como relacionarlo */

/* Consultas resumen de datos */
select count(persona.id) as "Numero de alumnos" from persona where persona.tipo = "alumno";
select count(persona.id) as "Nacidos en 1999" from persona where year(persona.fecha_nacimiento) = 1999;
select departamento.nombre as "Departamento", count(persona.id) as "Profesores_trabajan" from profesor inner join persona on profesor.id_profesor = persona.id inner join departamento on profesor.id_departamento = departamento.id group by departamento.nombre order by Profesores_trabajan desc, departamento.nombre;
select departamento.nombre as "Departamento", count(persona.id) as "Profesores_trabajan" from (profesor inner join persona on profesor.id_profesor = persona.id) right join departamento on profesor.id_departamento = departamento.id group by departamento.nombre order by Profesores_trabajan desc, departamento.nombre;
select grado.nombre as "Grado", count(asignatura.id) as "Cantidad_asignaturas" from grado left join asignatura on grado.id = asignatura.id_grado group by Grado order by Cantidad_asignaturas desc, Grado;
select grado.nombre as "Grado", count(asignatura.id) as "Cantidad_asignaturas" from grado left join asignatura on grado.id = asignatura.id_grado group by Grado having Cantidad_asignaturas > 40 order by Cantidad_asignaturas desc, Grado;
select grado.nombre as "Grado", asignatura.tipo, sum(asignatura.creditos) as "Creditos" from grado inner join asignatura on grado.id = asignatura.id_grado group by Grado, asignatura.tipo;
select curso_escolar.anyo_inicio, count(alumno_se_matricula_asignatura.id_alumno) as "alumnos_matriculados" from curso_escolar inner join alumno_se_matricula_asignatura on curso_escolar.id = alumno_se_matricula_asignatura.id_curso_escolar group by curso_escolar.anyo_inicio;
select persona.id, persona.nombre, persona.apellido1, persona.apellido2, count(asignatura.id) as "asignaturas_impartidas" from persona left join asignatura on persona.id = asignatura.id_profesor where persona.tipo = "profesor" group by persona.id order by asignaturas_impartidas desc, persona.id desc;
select persona.* from persona where persona.fecha_nacimiento in (select max(persona.fecha_nacimiento) from persona);
select persona.* from persona inner join profesor on persona.id = profesor.id_profesor left join asignatura on persona.id = asignatura.id_profesor where persona.tipo = "profesor" and isnull(asignatura.id_profesor);