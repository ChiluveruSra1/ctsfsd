const express = require('express')
const empRoutes = require("./routes/employee")
const morgan = require('morgan')
const app = express()
const mongoo = require('mongoose')

mongoo.connect('mongodb://localhost:27017/empDB', {
    useNewUrlParser: true,
    useUnifiedTopology: true
},
    err => {
        if (err) {
            console.log('mongodb couldnt connect')
        }
        else {
            console.log('mongodb connected')
        }
    }
)

app.get('/', (req, res) => {
    res.status(200).json({

        error: false,
        message: 'api is up and running'
    })
})
app.use(express.json());
app.post('/',(req,res)=>{
    console.log(req.body)
})

app.use(morgan('dev'))
app.use('/api/v1/employee', empRoutes)

const PORT = process.env.PORT || 5000

app.listen(PORT, () => {
    console.log(`server is running at PORT: ${PORT}`)
})