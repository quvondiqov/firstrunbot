import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotOptions;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.meta.generics.WebhookBot;

public class boyfriend1001_bot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        if (update.getMessage()!=null&&update.getMessage().hasText()){
            long chatid = update.getMessage().getChatId();

            try {
                execute(new  SendMessage(chatid,"Salom"+"\t"+update.getMessage().getText()));

            }
            catch (TelegramApiException e){
                e.printStackTrace();
            }
        }



    }



    public String getBotUsername() {
        return "boyfriend1001_bot";
    }

    public String getBotToken() {
        return "1314745544:AAGPNK4xnjnTKC6DpMPjZ9GLISps3bEn4mI";
    }


}
