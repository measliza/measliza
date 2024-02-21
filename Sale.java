public class Sale {
    Customer customer;
    String date;
    double serviceExpense;
    double productExpense;
    Sale(Customer customer, String date){
        this.customer = customer;
        this.date = date;
    }
    String getDate(){
        return date;
    }
    double getServiceExpense(){
        return serviceExpense;
    }
    void setServiceExpense(double serviceExpense){
        this.serviceExpense = serviceExpense;
    }
    double getProductExpense(){
        return productExpense;
    }
    void setProductExpense(double productExpense){
        this.productExpense = productExpense;
    }
    double getTotalExpense(){
        double totalExpense = serviceExpense + productExpense;
        double serviceDiscount = serviceExpense * customer.getServiceMemberDiscount();
        double productDiscount = productExpense * customer.getProductMemberDiscount();
        return totalExpense - serviceDiscount - productDiscount;
    }
    void displayinfo(){
        System.out.println("Date: "+date);
        System.out.println("Customer Name: "+customer.getCustomerName());
        System.out.println("Customer Type: "+customer.getCustomerType());
        System.out.println("Service Expense: "+serviceExpense);
        System.out.println("Product Expense: "+productExpense);
        System.out.println("Total expense after discount: "+getTotalExpense());
    }
}
