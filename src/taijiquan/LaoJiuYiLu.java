package taijiquan;

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.nio.*;

public class LaoJiuYiLu {

    public static Scanner s = new Scanner(System.in);
    protected static String chenStyleTaijiquanPrinciples;
    protected static String theTao;

    public static void main(String[] args) {

        List<String> laoJiuYiLu = new ArrayList<>();

        laoJiuYiLu.add("Begin Taiji / Preparing form (tài jí qǐ shì, 太极起势");
        laoJiuYiLu.add("Buddha's Warrior Attendant Pounds Mortar (Jīngāng dǎo duì, 金刚捣碓");
        laoJiuYiLu.add("Lazily Tying Coat (lǎn zhā yī, 懒扎衣)");
        laoJiuYiLu.add("Six Sealing and Four Closing (liù fēng sì bì, 六封四闭)");
        laoJiuYiLu.add("Single Whip (dān biān, 单鞭)");
        laoJiuYiLu.add("Buddha's Warrior Attendant Pounds Mortar (Jīngāng dǎo duì, 金刚捣碓)");
        laoJiuYiLu.add("White Crane Spreads Wings (bái hè liàng chì, 白鹤亮翅)");
        laoJiuYiLu.add("Walking Obliquely (Xie Xing，斜行)");
        laoJiuYiLu.add("Brushing Knees (Lou Xi，搂膝)");
        laoJiuYiLu.add("Stepping Forward Three Steps (Shang San Bu，上三步)");
        laoJiuYiLu.add("Walking Obliquely (Xie Xing，斜行)");
        laoJiuYiLu.add("Brushing Knees (Lou Xi，搂膝)");
        laoJiuYiLu.add("Stepping Three Steps (Shang San Bu，上三步)");
        laoJiuYiLu.add("Hidden Thrust Punch (and Revolving Upper Arms) (Yan Shou Gong Quan，掩手肱拳)");
        laoJiuYiLu.add("Buddha's Warrior Attendant Pounds Mortar (Jin Gang Dao Dui, 金刚捣碓)");
        laoJiuYiLu.add("Striking Down by Twisting Body Obliquely (Pie Shen Quan，撇身拳)");
        laoJiuYiLu.add("Green Dragon Emerges from Water (Qin Long Chu Shui，青龙出水)");
        laoJiuYiLu.add("Double Pushing Hands (Shuang Tui Shou，双推手)");
        laoJiuYiLu.add("Striking with Fist Under Elbow (Zhou Di Kan Quan，肘底看拳)");
        laoJiuYiLu.add("Stepping Back and Wrapping Upper Arms (Dao Juan Gong，倒卷肱)");
        laoJiuYiLu.add("White Crane Spreads Wings (Bai He Liang Chi，白鹤亮翅)");
        laoJiuYiLu.add("Walking Obliquely (Xie Xing，斜行)");
        laoJiuYiLu.add("Flashing Turn to Back (Shan Tong Bei，闪通背)");
        laoJiuYiLu.add("Hidden Thrust Punch (and Whirling Upper Arms) (Yan Shou Gong Quan，掩手肱拳)");
        laoJiuYiLu.add("Six Sealing and Four Closing (Liu Feng Si Bi, 六封四闭)");
        laoJiuYiLu.add("Single Whip (Dan Bian，单鞭)");
        laoJiuYiLu.add("Cloud Hands (Yun Shou，云手)");
        laoJiuYiLu.add("High Patting on Horse (Gao Tan Ma，高探马)");
        laoJiuYiLu.add("Brushing Right Foot (You Ca Jiao，右擦脚)");
        laoJiuYiLu.add("Brushing Left Foot (Zuo Ca Jiao, 左擦脚)");
        laoJiuYiLu.add("Turn and Kick with Left Heel (Zhuan Shēn Zuo Deng Jiao，转身左蹬脚)");
        laoJiuYiLu.add("Stepping Forward Three Steps (Shang San Bu，上三步)");
        laoJiuYiLu.add("Pounding the Ground (Ji Di Chui，击地捶)");
        laoJiuYiLu.add("Double Jump Kick (Ti Er Qi，踢二起)");
        laoJiuYiLu.add("Protect-the-Heart Fist (Hu Xing Quan，护心拳)");
        laoJiuYiLu.add("Tornado Foot (Xuan Feng Jiao，旋风脚)");
        laoJiuYiLu.add("Kicking with the Right Heel(You Deng Jiao，右蹬脚)");
        laoJiuYiLu.add("Hidden Thrust Punch (and Whirling Upper Arms) (Yan Shou Gong Quan，掩手肱拳)");
        laoJiuYiLu.add("Capturing and Hitting (Xiao Qin Da，小擒打)");
        laoJiuYiLu.add("Embracing Head and Pushing Mountain (Bao Tou Tui Shan，抱头推山)");
        laoJiuYiLu.add("Six Sealing and Four Closing (Liu Feng Si Bi, 六封四闭)");
        laoJiuYiLu.add("Single Whip (Dan Bian，单鞭)");
        laoJiuYiLu.add("Forward Move(Qian Zhao，前招)");
        laoJiuYiLu.add("Backward Move(Hou Zhao，后招)");
        laoJiuYiLu.add("Parting the Wild Horse's Mane (Ye Ma Fen Zong，野马分鬃)");
        laoJiuYiLu.add("Six Sealing and Four Closing (Liu Feng Si Bi, 六封四闭)");
        laoJiuYiLu.add("Single Whip (Dan Bian，单鞭)");
        laoJiuYiLu.add("Fair Maiden Works Shuttles (Yu Nu Chuan Suo，玉女穿梭)");
        laoJiuYiLu.add("Lazily Tying Coat (Lan Zha Yi，懒扎衣)");
        laoJiuYiLu.add("Six Sealing and Four Closing (Liu Feng Si Bi, 六封四闭)");
        laoJiuYiLu.add("Single Whip (Dan Bian，单鞭)");
        laoJiuYiLu.add("Cloud Hands (Yun Shou，云手)");
        laoJiuYiLu.add("Double Wave Like Lotus (Shuang Bai Lian，双摆莲)");
        laoJiuYiLu.add("Fall into Split (Die Cha，跌叉)");
        laoJiuYiLu.add("Golden Rooster Stands on One Leg (Jin Ji Du Li，金鸡独立)");
        laoJiuYiLu.add("Stepping Back and Wrapping Upper Arms (Dao Juan Gong，倒卷肱)");
        laoJiuYiLu.add("Step Back and Whirl Arms (Tui Bu Ya Zhou,退步压肘)");
        laoJiuYiLu.add("White Crane Spreads Wings (Bai He Liang Chi，白鹤亮翅)");
        laoJiuYiLu.add("Walking Obliquely (Xie Xing,斜行)");
        laoJiuYiLu.add("Flashing Turn to Back (Shan Tong Bei，闪通背)");
        laoJiuYiLu.add("Hidden Thrust Punch and Whirling Upper Arm (Yan Shou Gong Quan，掩手肱拳)");
        laoJiuYiLu.add("Six Sealing and Four Closing (Liu Feng Si Bi, 六封四闭)");
        laoJiuYiLu.add("Single Whip (Dan Bian，单鞭)");
        laoJiuYiLu.add("Cloud Hands (Yun Shou，云手)");
        laoJiuYiLu.add("High Patting on Horse (Gao Tan Ma，高探马)");
        laoJiuYiLu.add("Crossed Feet (Shi Zi Dan Bai Lian，十字单摆莲)");
        laoJiuYiLu.add("Punch the Groin (Zhi Dang Chui，指裆捶)");
        laoJiuYiLu.add("Ape Presents Fruit (Yuan Hou Xian Guo，白猿献果)");
        laoJiuYiLu.add("Single Whip (Dan Bian，单鞭)");
        laoJiuYiLu.add("Dragon on the Ground(Que Di Long，雀地龙)");
        laoJiuYiLu.add("Stepping Forward to Form the Seven Stars (Shang Bu Qi Xing，上步七星)");
        laoJiuYiLu.add("Stepping Back to Rid the Tiger (Tui Bu Kua Hu，退步跨虎)");
        laoJiuYiLu.add("Turn Back and Double Wave Lotus (Zhuan Shen Shuang Bai Lian，转身双摆莲)");
        laoJiuYiLu.add("Cannon Right in Front (Dang Tou Pao，当头炮)");
        laoJiuYiLu.add("Buddha's Warrior Attendant Pounds Mortar (Jing Gang Dao Dui, 金刚捣碓)");
        laoJiuYiLu.add("Close Taiji Form (Tai Ji Shou Si, 太极收势)");

        System.out.println(laoJiuYiLu.);

    }


}
