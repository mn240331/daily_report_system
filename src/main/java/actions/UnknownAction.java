package actions;

import java.io.IOException;

import javax.servlet.ServletException;

import constants.ForwardConst;


 //エラー発生時の処理行うActionクラス
public class UnknownAction extends ActionBase {

    /**
     * 共通エラー画面「お探しのページは見つかりませんでした。」を表示する
     */
    @Override
    public void process() throws ServletException, IOException {

        //forward:引数で指定されたjspの呼び出しを行います
        //エラー画面を表示
        forward(ForwardConst.FW_ERR_UNKNOWN);

    }
}
