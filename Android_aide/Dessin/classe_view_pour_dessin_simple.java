public class LaVue extends View {
    private Paint je_suis_de_la_peinture_pour_figure;
    private Paint je_suis_de_la_peinture_pour_fond;

    public LaVue(Context context, AttributeSet attrs){
        super(context,attrs);

        this.je_suis_de_la_peinture_pour_figure = new Paint();
        this.je_suis_de_la_peinture_pour_figure.setARGB(255,80,80,80);

        this.je_suis_de_la_peinture_pour_fond = new Paint();
        this.je_suis_de_la_peinture_pour_fond.setARGB(255,80,80,80);
        this.current_end = 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i;

        canvas.drawRect(0,0,getWidth(),getHeight(),this.je_suis_de_la_peinture_pour_fond);
        
        canvas.drawCircle(50,50,50,this.je_suis_de_la_peinture_pour_figure);

        // pour les méthodes de canvas : https://developer.android.com/reference/android/graphics/Canvas

    }
}