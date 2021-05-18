package Commands;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.util.List;

public class Clear extends ListenerAdapter {

    //過去のチャットを削除
    //Command -> !clear [1～100の数値]
    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String s = e.getMessage().getContentRaw();
        if(s.startsWith("m.clear")) {
            String[] ss = e.getMessage().getContentRaw().split(" ");
            int i = Integer.parseInt(ss[1]);
            if(i <= 100 && i > 0) {
                List<Message> messages  = e.getTextChannel().getHistory().retrievePast(i).complete();
                for(Message m : messages) {
                    m.delete().queue();
                }
            }else {
                e.getTextChannel().sendMessage("数は1～100までです").queue();
            }
        }
    }
}
