namespace java com.whp.demo.thrift.optional
struct Car {
1:required i32 carId,
2:required string carName,
3:required i64 price,
4: optional i16 age=0
}

struct Consumer{
1:required i32 consumerId,
2:optional string name
}

struct Order{
required i64 orderId,
required Car car,
required Consumer consumer,
}

service CarService{
Order createBuyCarOder(1:required Car car, 2:required Consumer consumer)
}