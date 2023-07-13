class Order {
    private var state: OrderState = NewOrderState()

    fun setState(state: OrderState)
    {
        this.state = state;
    }

    fun process() {
        state.processOrder(this)
    }
}

class ShippedOrderState: OrderState {
    override fun processOrder(order: Order) {
        println("Order has already been shipped.")
    }
}

class NewOrderState: OrderState {
    override fun processOrder(order: Order) {

        println("Processing new order...")
        order.setState(ShippedOrderState())
    }

}