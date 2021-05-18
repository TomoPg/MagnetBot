package Commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Ping extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String messageSent = e.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("m.Ping")){
            e.getChannel().sendMessage(":globe_with_meridians: Ping：" + e.getJDA().getPing()).queue();
        }
    }
}
