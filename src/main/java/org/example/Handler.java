package org.example;

public interface Handler {

    BotResponse returnResponse(BotRequest request);
    //если пользователь хочет отметить более 1 задания, то
    //спросить сколько хочет отметить и
    //дать ему отметить и только после этого обновлять список
    //или наличие кнопок "завершить отметку выполненных задач" и "есть ещё выполненная задача"
    public void doneTask();

    //после каждого изменения спрашивать хочет ли он что-то изменить ещё
    // Или наличие кнопок "завершить изменения" и "хочу изменить ещё"
    public void changeTask();

    //исп после new/delete/change/done и работать сразу со всем списком задач
    //должна вкл в себя обновление нумерации всех дел
    public void updateTask();

    //После удаления обновляется нумерация списка задач
    //Если пользователь хочет удалить более 1 задания, то спросить сколько хочет удалить и дать ему удалить и только после этого обновлять список
    //Или наличие кнопок "завершить удаление задач" и "есть ещё задача которую я хочу удалить"
    public void deleteTask();
}