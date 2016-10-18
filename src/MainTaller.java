public class MainTaller {
    public static void main(String[] args) {
        Persona jose = new Persona("39425364H", "111111111", "Jose", "Tomás", 35, 45000.00);
        Persona maria = new Persona("39425654W", "33333333", "Maria", "Gallego", 55, 61300.20);
        Persona carlos = new Persona("39425355Q", "22222222", "Carlos", "Torres", 22, 23000.00);
        Persona anna = new Persona("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);

        Coche cocheM = new Coche("","","",0);
        Coche Jaguar = new Coche("1234ENG", "Jaguar", "TheRoadIsYours", 200000);
        Coche BMW = new Coche("9065AME", "BMW", "LoveAtFirstDrive", 60000);
        Coche Lexus = new Coche("5638DDD", "Lexus", "FastAndGlorious", 120000);
        Coche Austin = new Coche("3564GER", "Austin", "BeLikeBond", 150000);


        Taller taller = new Taller();
        taller.registrarReparacion(jose, Jaguar);
        taller.registrarReparacion(maria, BMW);
        taller.registrarReparacion(carlos, Lexus);
        taller.registrarReparacion(anna, Austin);

        System.out.println(taller.obtenerCoche(jose));
        // debes comprobar que las personas aparecen ordenadas según el criterio especificado en el comparador
        // que se pasa al constructor del TreeMap
        System.out.println(taller.obtenerClientes());
    }
}