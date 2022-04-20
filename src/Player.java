public class Player {

    /** Instance and Varibale Requirements
     * name and level
     */
    private String name;
    private int level;

    /**
     * static variables requirements
     */

    private static int max_level=0;
    private static int player_count=0;

    /**
     * Constructor
     */
    Player(String playerName,int playerLevel){
        this.level = playerLevel;

        /**
         * counter and comparison
         */
        player_count++;
        if (player_count == 1){
            max_level = playerLevel;
        }else if (playerLevel > max_level){
            max_level = playerLevel;
        }
    }

    /**
     getters
     */

    public static int getplayer_count() {
        return player_count;
    }

    public static int getmax_level() {
        return max_level;
    }
}
