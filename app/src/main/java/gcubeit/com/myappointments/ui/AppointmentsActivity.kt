package gcubeit.com.myappointments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import gcubeit.com.myappointments.model.Appointment
import kotlinx.android.synthetic.main.activity_appointments.*

class AppointmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointments)

        val appointments = ArrayList<Appointment>()
        appointments.add(
                Appointment(1, "Medico Test", "12/12/2020", "3:00 PM")
        )
        appointments.add(
                Appointment(2, "Medico BB", "15/12/2020", "8:00 AM")
        )
        appointments.add(
                Appointment(3, "Medico CC", "25/12/2020", "1:00 PM")
        )
        rvAppointments.layoutManager = LinearLayoutManager(this) // GridLayoutManager
        rvAppointments.adapter = AppointmentAdapter(appointments)
    }
}