package ru.chaban.exercise_4.request;

public class RequestDto {
    //Идентификатор экземпляра продукта
    Integer instanceId;

    //Тип Экземпляра Продукта
    String productType;

    //Код продукта в каталоге продуктов
    String productCode;

    //Тип регистра
    String registerType;

    //Код Клиента (mdm)
    String mdmCode;

    // Номер договора
    String contractNumber;

    //Дата заключения договора обслуживания
    String contractDate;

    //Приоритет
    String priority;

    //Штрафная процентная ставка
    String interestRatePenalty;

    // Неснижаемый остаток
    String minimalBalance;

    // Пороговая сумма
    String thresholdAmount;

    // Реквизиты выплаты
    String accountingDetails;

    // Выбор ставки в зависимости от суммы
    String rateType;

    // Ставка налогообложения
    Integer taxPercentageRate;

    // Сумма лимита технического овердрафта
    Integer technicalOverdraftLimitAmount;

    // ID Договора
    String ontractId;

    // Код филиала
    String BranchCode;

    // Код валюты
    String IsoCurrencyCode;

    // Код срочности договора
    String urgencyCode;

    // Код точки продаж
    String ReferenceCode;

}