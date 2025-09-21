package vagapov.core.block_2;

//Название не менять
enum Weekend {
    //это можно переименовать или удалить как начнешь
    TEST;
    /**
     * Реализовать Enum Weekend Day, который будет отвечать за дни недели. Этот Enum должен содержать следующие элементы:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
     * Так же, в этом Enum должны быть релизованы два метода:
     * 1. public boolean isWeekend() - метод, отвечающий на вопрос, является ли конкретный элемент - выходным днем.
     * (выходным днем являются только суббота и воскресенье)
     * 2. public String getRusName() - метод, возвращающий русское название дня недели
     */

    public boolean isWeekend() {
        return false;
    }

    public String getRusName() {
        return null;
    }
}
