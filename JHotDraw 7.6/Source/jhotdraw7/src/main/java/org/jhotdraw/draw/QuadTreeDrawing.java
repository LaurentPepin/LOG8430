/*
 * @(#)QuadTreeDrawing.java
 *
 * Copyright (c) 1996-2010 by the original authors of JHotDraw and all its
 * contributors. All rights reserved.
 *
 * You may not use, copy or modify this file, except in compliance with the 
 * license agreement you entered into with the copyright holders. For details
 * see accompanying license terms.
 */
package org.jhotdraw.draw;

import org.jhotdraw.draw.action.SendToBackSAMActionProposal;
import org.jhotdraw.draw.event.FigureEvent;
import org.jhotdraw.geom.QuadTree;
import java.awt.*;
import java.awt.geom.*;
import org.jhotdraw.util.*;
import java.util.*;
import org.jhotdraw.geom.Geom;
import static org.jhotdraw.draw.AttributeKeys.*;

/**
 * An implementation of {@link Drawing} which uses a
 * {@link org.jhotdraw.geom.QuadTree} to provide a good responsiveness for
 * drawings which contain many figures.
 *
 * @author Werner Randelshofer
 * @version $Id: QuadTreeDrawing.java 717 2010-11-21 12:30:57Z rawcoder $
 */
public class QuadTreeDrawing extends AbstractDrawing {

    private QuadTree<Figure> quadTree = new QuadTree<Figure>();
    private boolean needsSorting = false;

    public void present(SAMActionProposal prop, State state) {
        // Valider les paramètres et gestion des erreurs

        // En fonction du type de Proposal donné, exécuter la méthode privée correspondante.
        switch (prop.getClass()) {
            case "SendToBackSAMActionProposal":
                this.sendToBack(prop.figure);
        
            // Ajouter les autres actions ici, comme bringToFront
        }
        

        // Si nécessaire, mettre à jour le state representation, en lui donnant le model, i.e this
        this.SAMStateRepresentation.update(this)
    }

    
}
