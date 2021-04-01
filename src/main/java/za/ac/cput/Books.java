package za.ac.cput;

/**
 * This is a simple book class.
 * @author: Melven Johannes Booysen (219201277)
 *  * Date: 31 March 2021
 */

public class Books
{
    private String title;
    private double price;
    private int copiesInStock;

    //Default constructor
    public Books()
    {

    }//**** End of constructor ****

    //Constructor
    public Books(String title, double price, int copiesInStock)
    {
        this.title = title;
        this.price = price;
        this.copiesInStock = copiesInStock;
    }//**** End of Constructor ****

    //Section for Getters
    public String getTitle()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }

    public int getCopiesInStock()
    {
        return copiesInStock;
    }//**** End of Getters ****

    //Section for Setters
    public void setTitle(String title)
    {
        this.title =title;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setCopiesInStock(int copiesInStock)
    {
        this.copiesInStock = copiesInStock;
    }//**** End of Setters ****

    public double discount( int numberOfBooks)
    {
        double discount = 00;
        if(numberOfBooks >=10)
        {
            discount = 0.10;
        }
        else if (numberOfBooks >=5)
        {
            discount = 0.05;
        }//**** End of if Statement ****
        return discount;
    }//**** End of discount ****

    public double sell(int numberOfBooks)
    {
        double pricePerBook = 0.0;
        double priceAllBooks = 0.0;
        double discountBook = 0.0;

        if(numberOfBooks <=copiesInStock)
        {
            pricePerBook = pricePerBook * numberOfBooks;
            priceAllBooks = (1-discount(numberOfBooks));
            copiesInStock = copiesInStock - numberOfBooks;
            discountBook = discount(numberOfBooks);
        }
        return priceAllBooks;
    }//**** End of Sell ****

    public String toString()
    {
        return "Title: " +title+ ",Price: R" +price+ ",Copies in stock: " +copiesInStock;

    }//**** End of toString ****

    public void show()
    {
        System.out.println("Title: " +getTitle()+ ",Price: R" +getPrice()+ ",Copies in stock: " +getCopiesInStock());
    }//**** End of Show() ****
}//**** End of Class ****
