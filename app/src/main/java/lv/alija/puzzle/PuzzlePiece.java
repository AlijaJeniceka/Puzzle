package lv.alija.puzzle;

import android.content.Context;
import android.graphics.Bitmap;

public class PuzzlePiece extends androidx.appcompat.widget.AppCompatImageView {
    public int xCoord;
    public int yCoord;
    public int pieceWidth;
    public int pieceHeight;
    public boolean canMove = true;

    public PuzzlePiece(Context context) {
        super(context);
    }


}