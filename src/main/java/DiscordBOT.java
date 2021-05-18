import Commands.Clear;
import Commands.NS;
import Commands.Ping;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class DiscordBOT extends ListenerAdapter {

    public static void main(String[] args) {
        JDABuilder b = new JDABuilder();
        JDA jda = null;
        try {
            jda = b.setToken("ODQxNjIxODUzNTcwNDY1Nzky.YJpbbg.FFByaaadf9T-6qRVTxZcMewM3AY").build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
        //継承
        jda.addEventListener(new NS());
        jda.addEventListener(new Clear());
        jda.addEventListener(new Ping());
    }

}
