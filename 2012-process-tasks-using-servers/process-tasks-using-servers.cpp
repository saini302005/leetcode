class Solution {
public:
    typedef pair<int, int> Server;              // {weight, index}
    typedef pair<long long, int> BusyServer;    // {releaseTime, index}

    vector<int> assignTasks(vector<int>& servers, vector<int>& tasks) {
        int n = servers.size(), m = tasks.size();
        long long currTime = 0;
        int taskIdx = 0;

        // Min-heaps
        priority_queue<Server, vector<Server>, greater<>> availableServers;
        priority_queue<BusyServer, vector<BusyServer>, greater<>> busyServers;

        // Initialize all servers as available
        for (int i = 0; i < n; ++i) {
            availableServers.push({servers[i], i});
        }

        vector<int> assignedServers;

        while (taskIdx < m) {
            int taskDuration = tasks[taskIdx], taskStartTime = taskIdx;

            currTime = max(currTime, (long long)taskStartTime);

            // If no servers are free, fast forward to the next available time
            if (availableServers.empty()) {
                currTime = max(currTime, busyServers.top().first);
            }

            // Release any servers than have finished processing back to available server queue
            while (!busyServers.empty() && busyServers.top().first <= currTime) {
                auto [releaseTime, serverId] = busyServers.top(); 
                busyServers.pop();

                availableServers.push({servers[serverId], serverId});
            }

            // Assign an available server
            auto [weight, index] = availableServers.top(); 
            availableServers.pop();

            busyServers.push({currTime + taskDuration, index});
            assignedServers.push_back(index);

            ++taskIdx;
        }

        return assignedServers;
    }
};