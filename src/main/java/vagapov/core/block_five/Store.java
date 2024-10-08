package vagapov.core.block_five;


import java.util.Map;

public class Store {

    /**
     * Задание 1.
     *
     * Магазину нужно сохранять информацию о продажах для каждого сотрудника.
     * Напишите метод который принимает String содержащий:
     *
     * Алексей 3000
     * Дмитрий 9000
     * Антон 3000
     * Алексей 7000
     * Антон 8000
     *
     * Метод должен заполнить и вернуть карту где ключом будет имя сотрудника, а значением сумма (Integer) всех его продаж.
     *
     * Пример вывода:
     * {Алексей=[10000], Дмитрий=[9000], Антон=[11000]}
     */

    public Map<String, Integer> getSalesMap(String value) {
        return null;
    }

    /**
     * Задание 2. Посложнее
     *
     * Магазину нужно узнать кому из сотрудников следует повысить зарплату
     * Напишите метод который принимает:
     * 1 - карту empToPercentMap содержащий имя сотрудника и его процент продаж:
     *
     * Алексей 60
     * Дмитрий 90
     * Антон 100
     * Алексей 30
     * Антон 70
     *
     * 2 - карту empToSalaryMap содержащий имя сотрудника и его зарплату:
     *
     * Алексей 3000
     * Дмитрий 9000
     * Антон 3000
     * Алексей 7000
     * Антон 8000
     *
     * Метод должен вычислить средний процент продаж
     * и поднять зарплату сотрудникам у которых процент выше чем средний показатель на величину разницы процентов, например:
     * средний процент продаж - 60, у Дмитрия он составляет 90, значит 90-60 = 30, поднимаем зарплату Дмитрия на 30%
     *
     * Метод должен вернуть мапу с ключом: "имя сотрудника" - значение: "сумма на которую повышаем зарплату", пример:
     * {Алексей=[0], Дмитрий=[3000]}
     * Доп условия:
     * 1. У кого процент продаж меньше чем среднее значение в мапу добавлять не нужно
     * 2. У тех у кого процент продаж = среднее значение, добавляем в мапу но ставим сумму равную "0"
     */
    Map<String, Integer> findEmployeesForRaise(Map<String, Integer> empToPercentMap, Map<String, Integer> empToSalaryMap) {
        return null;
    }

}
