package Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;

public class NS extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String messageSent = e.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("m.ns")){
            e.getChannel().sendMessage(new EmbedBuilder()
                    .addField("N予備校","https://www.nnn.ed.nico/home",true)
                    .addField("N/S高生徒用サイト","https://secure.nnn.ed.jp/mypage/home https://s-secure.nnn.ed.jp/mypage/",false)
                    .addField("通学コース生徒用サイト","https://sites.google.com/nnn.ac.jp/curriculum/%E3%83%9B%E3%83%BC%E3%83%A0?authuser=3",false)
                    .addField("ナレッジベース","https://sites.google.com/nnn.ed.jp/knowledgebase/top?authuser=3", false)
                    .setTitle("NShelp")
                    .setDescription("N/S高の各サイトを表示しています")
                    .setThumbnail("https://illust8.com/wp-content/uploads/2018/08/mark_hatena_question_illust_902.png")
                    .setFooter("問題があった場合BOT制作者まで連絡してください -> @Tomo_N4_ / Tomo#5555","https://pbs.twimg.com/media/EojSTIyVoAcQCLm.jpg")
                    .setColor(Color.CYAN)
                    .setAuthor("") // アイコンを設定することもできます
                    .build()).queue();
        }
    }
}
