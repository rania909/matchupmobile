/*
 * Copyright (c) 2016, Codename One
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, 
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions 
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE 
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */

package com.matchup.GUI;

import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;

/**
 * Utility methods common to forms e.g. for binding the side menu
 *
 * @author Shai Almog
 */
public class BaseForm extends Form {
    public void installSidemenu(Resources res) {
        Image selection = res.getImage("selection-in-sidemenu.png");
        
        Image inboxImage = null;
        if(isCurrentInbox()) inboxImage = selection;

        Image trendingImage = null;
        if(isCurrentTrending()) trendingImage = selection;
        
        Image calendarImage = null;
        if(isCurrentCalendar()) calendarImage = selection;
        
        Image statsImage = null;
        if(isCurrentStats()) statsImage = selection;
        
         Image ShopImage = null;
        if(isCurrentShop()) ShopImage = selection;
        
         Image MatchImage = null;
        if(isCurrentMatch()) MatchImage = selection;
        
        
                Image terrainImage = null;
        if(isCurrentterrain()) terrainImage = selection;
        
              Image AfficherReservationImage = null;
        if(isCurrentAfficherReservation()) AfficherReservationImage = selection;
        
              Image ReserverImage = null;
        if(isCurrentReserver()) ReserverImage = selection;
        
        Image CalendarImage = null;
        if(isCurrentCalendar()) CalendarImage = selection;
         Image Image = null;
        if(isCurrentI()) Image = selection;
        
        Button inboxButton = new Button("Inbox", inboxImage);
        inboxButton.setUIID("SideCommand");
        inboxButton.getAllStyles().setPaddingBottom(0);
        Container inbox = FlowLayout.encloseMiddle(inboxButton, 
                new Label("18", "SideCommandNumber"));
        inbox.setLeadComponent(inboxButton);
        inbox.setUIID("SideCommand");
        inboxButton.addActionListener(e -> new ShopForm(res).show());
      //  getToolbar().addComponentToSideMenu(inbox);
        
        //getToolbar().addCommandToSideMenu("profil", statsImage, e -> new ShopForm(res).show());
       // getToolbar().addCommandToSideMenu("HomeForm", calendarImage, e -> new HomeForm(res).show());
        //getToolbar().addCommandToSideMenu("Map", null, e -> {});
        getToolbar().addCommandToSideMenu("Produit", ShopImage , e -> new ShopForm(res).show());
        getToolbar().addCommandToSideMenu("Statistique", trendingImage, e -> new StatForm(res).show());
        getToolbar().addCommandToSideMenu("Match", MatchImage, e -> new Matchs(res).show());
        getToolbar().addCommandToSideMenu("Terrain", terrainImage, e -> new ajouterterrainForm(res).show());
         getToolbar().addCommandToSideMenu("AfficherReservation", AfficherReservationImage, e -> new ListReservation(res).show());
        getToolbar().addCommandToSideMenu("Reserver", ReserverImage, e -> new AddReservation(res).show());
        getToolbar().addCommandToSideMenu("Calendar", CalendarImage, e -> new ReservationPark(res).show());
        getToolbar().addCommandToSideMenu("déconnexion", Image, e -> new SignInForm(res).show());
        // spacer
        getToolbar().addComponentToSideMenu(new Label(" ", "SideCommand"));
        getToolbar().addComponentToSideMenu(new Label(res.getImage("matchup.png"), "Container"));
//        getToolbar().addComponentToSideMenu(new Label("Detra Mcmunn", "SideCommandNoPad"));
//        getToolbar().addComponentToSideMenu(new Label("Long Beach, CA", "SideCommandSmall"));
    }

        
    protected boolean isCurrentInbox() {
        return false;
    }
    
    protected boolean isCurrentTrending() {
        return false;
    }

    protected boolean isCurrentCalendar() {
        return false;
    }

    protected boolean isCurrentStats() {
        return false;
    }
    
    protected boolean isCurrentShop() {
        return false;
    }
    
    protected boolean isCurrentMatch() {
        return false;
    }
       protected boolean isCurrentterrain() {
        return false;
    }
       
       
        protected boolean isCurrentAfficherReservation() {
        return false;
    }
       protected boolean isCurrentReserver() {
        return false;
    }
          protected boolean isCurrentI() {
        return false;
    }

    
}
