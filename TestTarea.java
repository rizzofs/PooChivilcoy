import java.time.LocalDate;

public class TestTarea {
    public static void main(String[] args) {
        tp1_5.Tarea tarea = new tp1_5().new Tarea("Hacer ejercicio", tp1_5.Prioridad.PENDIENTE, false, LocalDate.now().plusDays(3));

        System.out.println("Descripción de la tarea: " + tarea.mostrar());

        tarea.crear_descripcion("Hacer ejercicio en el gimnasio");
        System.out.println("Nueva descripción de la tarea: " + tarea.mostrar());

        tarea.asignar_prioridad(tp1_5.Prioridad.EN_PROCESO);
        System.out.println("Prioridad de la tarea: " + tarea.obtener_prioridad());
        ;

        tarea.fecha_limite(LocalDate.now().plusDays(2));
        System.out.println("Fecha límite de la tarea: " + tarea.obtener_fecha());


        tarea.Esta_finalizada(true);
        System.out.println("¿La tarea está completa? " + tarea.esCompleta());

        System.out.println("¿La tarea está vencida? " + tarea.esta_vencida());
    }
}

