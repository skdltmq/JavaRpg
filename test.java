import java.util.Scanner;

class RPG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final int PLAYER_MAX_HP = 100;
        final int PLAYER_MAX_MP = 50;
        final int PLAYER_HEAL_POINT = 50;
        final int PLAYER_HEAL_COST = 5;
        int playerHp = PLAYER_MAX_HP;
        int playerMp = PLAYER_MAX_MP;
        boolean defFlag = false;

        int enemyHp = 100;

        //전투처리
        clearScreen();
        while(true) {
            printEnemyBody();
            System.out.println("슬라임의 HP:" + enemyHp);
            System.out.println();
            System.out.println("용사의 HP:" + playerHp + "/" + PLAYER_MAX_HP + "MP:" + playerMp + "/"+PLAYER_MAX_MP);
            System.out.println("    0)攻撃 1)回復 2)防御 3)逃げる >");
            System.out.print("どうする?>");

            switch(Integer.parseInt(sc.nextLine())) {
                case 0: //attack
                    int damage = (int) (Math.random() * 9) + 1;
                    enemyHp -= damage;
                    showMessage("공격했다！\n" + damage + "데미지를주었다");
                    break;
                case 1:
                    if(playerMp-PLAYER_HEAL_COST >= 0){
                        showMessage(PLAYER_HEAL_POINT + "회복했다");
                        playerHp += PLAYER_HEAL_POINT;
                        if(playerHp > PLAYER_MAX_HP){
                            playerHp = PLAYER_MAX_HP;
                        }
                        playerMp -= PLAYER_HEAL_COST;
                    } else {
                        showMessage("MP부족");
                    }
                    break;
                case 2:
                    showMessage("방어중");
                    defFlag = true;
                    break;
                case 3:
                    showMessage("도망간다");
                    showMessage("도망실패!");
                    break;
                default :
                    showMessage("존재하지않는커맨드");
                    break;
            }
            if(enemyHp <= 0) {
                showMessage("슬라임은 쓰러졌다!\nYou Win");
                return;
            } else {
                int damage = (int) (Math.random() * 9) + 1;
                if(defFlag) {
                    damage /= 2;
                }
                playerHp -= damage;
                showMessage("슬라임의 공격!\n" + damage + "데미지를받았다!");
            }

            if(playerHp <= 0) {
                showMessage("당신은 죽었습니다");
                return;
            }

            defFlag = false;
            clearScreen();
        }
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(Exception exception){
        }
    }

    private static void printEnemyBody() {
        System.out.println("       123123132     ");
        System.out.println("       123123132     ");
        System.out.println("       123123132     ");
        System.out.println("       123123132     ");
        System.out.println("       123123132     ");
        System.out.println("       123123132     ");
        System.out.println("       123123132     ");
        System.out.println("       123123132     ");
    }

    private static void showMessage(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message+"▽");
        sc.nextLine();
    }
}