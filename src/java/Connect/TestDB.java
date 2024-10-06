/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import Model.ArticleModel;

/**
 *
 * @author Administrator
 */
public class TestDB {

    public static void main(String[] args) throws Exception {
        ArticleModel artical = new ArticleModel();
        System.out.println("id=" + artical.getTotalRows());
    }
}
